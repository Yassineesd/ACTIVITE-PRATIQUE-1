package ext;
import dao.IDao;
public class DaoImpl2 implements IDao {


    @Override
    public double getData() {
        System.out.println("VERSION CAPTEURS");
        double temp = 7000;

        return temp;
    }
}
