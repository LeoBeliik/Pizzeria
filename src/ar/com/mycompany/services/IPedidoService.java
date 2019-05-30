package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.EstadoPedidos;
import ar.com.mycompany.entities.Facturas;
import ar.com.mycompany.entities.Pedidos;
import ar.com.mycompany.entities.Pizzas;

import java.util.Date;
import java.util.List;


public interface IPedidoService {

    Pedidos find(int idPedidos);

    void save(Pedidos entity);

    String delete(Pedidos entity);

    List<Pedidos> getAll();

    List<EstadoPedidos> getListEstadoPedidos();

    EstadoPedidos findEstadoPedidosById(int idEstadoPedidos);

    List<Pizzas> getListPizzas();

    Pizzas findPizzasById(int idPizzas);

    List<Pedidos> getPedidos(Date desde, Date hasta);

    void facturarPedido(Facturas entity);
}
