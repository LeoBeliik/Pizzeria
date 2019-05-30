package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.Pizzas;

import java.util.List;


public interface IPizzaDao {

    Pizzas get(int idPizza);

    void save(Pizzas entity);

    String delete(Pizzas entity);

    List<Pizzas> getAll();

}
