package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.TamanioPizzas;

import java.util.List;


public interface ITamanioPizzaDao {

    TamanioPizzas get(int idTamanioPizza);

    void save(TamanioPizzas entity);

    String delete(TamanioPizzas entity);

    List<TamanioPizzas> getAll();

}
