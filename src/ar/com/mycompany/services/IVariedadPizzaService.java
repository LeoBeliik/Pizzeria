package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.VariedadPizzas;

import java.util.List;


public interface IVariedadPizzaService {

    VariedadPizzas find(int idVariedadpizza);

    void save(VariedadPizzas entity);

    String delete(VariedadPizzas entity);

    List<VariedadPizzas> getAll();

}
