package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class Presentation2 {/*instanciation dynamique*/
    public static void main(String[] args) throws Exception{
        Scanner scanner =new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        cDao.newInstance();
        IDao dao=(IDao) cDao.newInstance();
        System.out.println(dao.getData());
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);/*execute la methode*/

        System.out.println("resultat="+metier.calcul());
    }
}