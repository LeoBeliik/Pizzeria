package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.EstadoFacturas;
import ar.com.mycompany.entities.Facturas;
import ar.com.mycompany.entities.Pedidos;

import java.util.List;

public interface IFacturasService {

    Facturas find(int idFacturas);

    void save(Facturas entity);

    String delete(Facturas entity);

    List<Facturas> getAll();
    
    List<EstadoFacturas> getListEstadoFacturas();
    
    List<Pedidos> getListPedidos();

    EstadoFacturas findEstadoFacturasById(int idEstadoFacturas);

}
