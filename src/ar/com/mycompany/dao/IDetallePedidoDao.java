package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.DetallePedidos;

import java.util.List;

public interface IDetallePedidoDao {

    DetallePedidos get(int idDetallePedido);

    void save(DetallePedidos entity);

    String delete(DetallePedidos entity);

    List<DetallePedidos> getAll();

}
