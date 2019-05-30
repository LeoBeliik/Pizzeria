package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.TamanioPizzas;

import java.util.List;


public interface ITamanioPizzaService {

    TamanioPizzas find(int idTamanioPizza);

    void save(TamanioPizzas entity);

    String delete(TamanioPizzas entity);

    List<TamanioPizzas> getAll();

}
