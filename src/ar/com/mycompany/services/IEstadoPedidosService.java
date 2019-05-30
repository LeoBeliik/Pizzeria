package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.EstadoPedidos;

import java.util.List;

public interface IEstadoPedidosService {

    EstadoPedidos find(int idEstadoPedidos);

    void save(EstadoPedidos entity);

    String delete(EstadoPedidos entity);

    List<EstadoPedidos> getAll();

}
