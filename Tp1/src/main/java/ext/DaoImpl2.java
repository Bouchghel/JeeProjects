package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getDate() {
        return Math.random()*50;
    }
}
