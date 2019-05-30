package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.Pedidos;

import java.util.Date;
import java.util.List;


public interface IPedidoDao {

    Pedidos get(int idPedidos);

    void save(Pedidos entity);

    String delete(Pedidos entity);

    List<Pedidos> getAll();

    List<Pedidos> getPedidos(Date desde, Date hasta);

}
