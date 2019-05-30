package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IPizzaDao;
import ar.com.mycompany.dao.ITamanioPizzaDao;
import ar.com.mycompany.dao.ITipoPizzaDao;
import ar.com.mycompany.dao.IVariedadPizzaDao;
import ar.com.mycompany.daoImp.PizzaDao;
import ar.com.mycompany.daoImp.TamanioPizzaDao;
import ar.com.mycompany.daoImp.TipoPizzaDao;
import ar.com.mycompany.daoImp.VariedadPizzaDao;
import ar.com.mycompany.entities.Pizzas;
import ar.com.mycompany.entities.TamanioPizzas;
import ar.com.mycompany.entities.TipoPizzas;
import ar.com.mycompany.entities.VariedadPizzas;
import ar.com.mycompany.services.IPizzaService;

import java.util.List;


public class PizzaService implements IPizzaService {

    static IPizzaDao entityDao = new PizzaDao();
    private static ITipoPizzaDao tipoPizzaDao = new TipoPizzaDao();
    private static IVariedadPizzaDao variedadPizzaDao = new VariedadPizzaDao();
    private static ITamanioPizzaDao tamanioPizzaDao = new TamanioPizzaDao();

    public Pizzas find(int idPizza) {
        return entityDao.get(idPizza);
    }

    public void save(Pizzas entity) {
        entityDao.save(entity);
    }

    public String delete(Pizzas entity) {
        return entityDao.delete(entity);
    }

    public List<Pizzas> getAll() {
        return entityDao.getAll();
    }

    public List<TipoPizzas> getListTipoPizzas() {
        return tipoPizzaDao.getAll();
    }

    public TipoPizzas findTipoPizzasById(int idTipoPizzas) {
        return tipoPizzaDao.get(idTipoPizzas);
    }

    public List<VariedadPizzas> getListVariedadPizzas() {
        return variedadPizzaDao.getAll();
    }

    public VariedadPizzas findVariedadPizzasById(int idVariedadPizzas) {
        return variedadPizzaDao.get(idVariedadPizzas);
    }

    public List<TamanioPizzas> getListTamanioPizzas() {
        return tamanioPizzaDao.getAll();
    }

    public TamanioPizzas findTamanioPizzasById(int idTamanioPizzas) {
        return tamanioPizzaDao.get(idTamanioPizzas);
    }

}
