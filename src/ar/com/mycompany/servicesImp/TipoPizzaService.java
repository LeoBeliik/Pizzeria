package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.ITipoPizzaDao;
import ar.com.mycompany.daoImp.TipoPizzaDao;
import ar.com.mycompany.entities.TipoPizzas;
import ar.com.mycompany.services.ITipoPizzaService;

import java.util.List;


public class TipoPizzaService implements ITipoPizzaService {

    static ITipoPizzaDao entityDao = new TipoPizzaDao();

    public TipoPizzas find(int idTipoPizza) {
        return entityDao.get(idTipoPizza);
    }

    public void save(TipoPizzas entity) {
        entityDao.save(entity);
    }

    public String delete(TipoPizzas entity) {
        return entityDao.delete(entity);
    }

    public List<TipoPizzas> getAll() {
        return entityDao.getAll();
    }
}
