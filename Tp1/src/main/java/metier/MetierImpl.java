package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getDate();
        double res=temp*20;
        return res;
    }

    public void setDao(IDao dao){
        this.dao=dao;
    }


}
