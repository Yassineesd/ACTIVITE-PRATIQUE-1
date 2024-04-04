package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*   CONNECT AU BD POUR LA RECUPERATION DES TEMPERATURES           */
        System.out.println("bd version");
        double temp=Math.random()*40;
        return temp;
    }
}
