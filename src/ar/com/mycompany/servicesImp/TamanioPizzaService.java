package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.ITamanioPizzaDao;
import ar.com.mycompany.daoImp.TamanioPizzaDao;
import ar.com.mycompany.entities.TamanioPizzas;
import ar.com.mycompany.services.ITamanioPizzaService;

import java.util.List;


public class TamanioPizzaService implements ITamanioPizzaService {

    static ITamanioPizzaDao entityDao = new TamanioPizzaDao();

    public TamanioPizzas find(int idTamanioPizza) {
        return entityDao.get(idTamanioPizza);
    }

    public void save(TamanioPizzas entity) {
        entityDao.save(entity);
    }

    public String delete(TamanioPizzas entity) {
        return entityDao.delete(entity);
    }

    public List<TamanioPizzas> getAll() {
        return entityDao.getAll();
    }
}
