package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IVariedadPizzaDao;
import ar.com.mycompany.daoImp.VariedadPizzaDao;
import ar.com.mycompany.entities.VariedadPizzas;
import ar.com.mycompany.services.IVariedadPizzaService;

import java.util.List;


public class VariedadPizzaService implements IVariedadPizzaService {

    static IVariedadPizzaDao entityDao = new VariedadPizzaDao();

    public VariedadPizzas find(int idVariedadPizza) {
        return entityDao.get(idVariedadPizza);
    }

    public void save(VariedadPizzas entity) {
        entityDao.save(entity);
    }

    public String delete(VariedadPizzas entity) {
        return entityDao.delete(entity);
    }

    public List<VariedadPizzas> getAll() {
        return entityDao.getAll();
    }
}
