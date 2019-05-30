package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.DetallePedidos;

import java.util.List;

public interface IDetallePedidoService {

    DetallePedidos find(int idDetallePedido);

    void save(DetallePedidos entity);

    String delete(DetallePedidos entity);

    List<DetallePedidos> getAll();

}
