package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.TipoPizzas;

import java.util.List;

public interface ITipoPizzaService {

    TipoPizzas find(int idTipoPizza);

    void save(TipoPizzas entity);

    String delete(TipoPizzas entity);

    List<TipoPizzas> getAll();

}
