package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.VariedadPizzas;

import java.util.List;


public interface IVariedadPizzaDao {

    VariedadPizzas get(int idVariedadpizza);

    void save(VariedadPizzas entity);

    String delete(VariedadPizzas entity);

    List<VariedadPizzas> getAll();

}
