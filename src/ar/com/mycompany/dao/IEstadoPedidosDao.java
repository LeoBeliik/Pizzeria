package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.EstadoPedidos;

import java.util.List;

public interface IEstadoPedidosDao {

    EstadoPedidos get(int idEstadoPedidos);

    void save(EstadoPedidos entity);

    String delete(EstadoPedidos entity);

    List<EstadoPedidos> getAll();

}
