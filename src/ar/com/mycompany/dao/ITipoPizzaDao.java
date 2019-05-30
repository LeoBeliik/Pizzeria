package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.TipoPizzas;

import java.util.List;

public interface ITipoPizzaDao {

    TipoPizzas get(int idTipoPizza);

    void save(TipoPizzas entity);

    String delete(TipoPizzas entity);

    List<TipoPizzas> getAll();

}
