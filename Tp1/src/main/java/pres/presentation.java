package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(new File("config.txt"));
        String DaoClassName=scanner.nextLine();
        Class Cdao = Class.forName(DaoClassName);
        IDao dao=(IDao) Cdao.newInstance();

        String MetierClassName=scanner.nextLine();
        Class Cmetier =Class.forName(MetierClassName);
        IMetier metier=(IMetier) Cmetier.newInstance();

        Method method=Cmetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);

        System.out.println(metier.calcul());

    }
}
