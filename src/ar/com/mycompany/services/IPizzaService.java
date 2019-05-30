package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.Pizzas;
import ar.com.mycompany.entities.TamanioPizzas;
import ar.com.mycompany.entities.TipoPizzas;
import ar.com.mycompany.entities.VariedadPizzas;

import java.util.List;

public interface IPizzaService {

    Pizzas find(int idPizza);

    void save(Pizzas entity);

    String delete(Pizzas entity);

    List<Pizzas> getAll();

    List<TipoPizzas> getListTipoPizzas();

    TipoPizzas findTipoPizzasById(int idTipoPizzas);

    List<VariedadPizzas> getListVariedadPizzas();

    VariedadPizzas findVariedadPizzasById(int idVariedadPizzas);

    List<TamanioPizzas> getListTamanioPizzas();

    TamanioPizzas findTamanioPizzasById(int idTamanioPizzas);
}
