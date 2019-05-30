package ar.com.mycompany.services;
// @author Leo

import ar.com.mycompany.entities.EstadoFacturas;

import java.util.List;

public interface IEstadoFacturasService {

    EstadoFacturas find(int idEstadoFacturas);

    void save(EstadoFacturas entity);

    String delete(EstadoFacturas entity);

    List<EstadoFacturas> getAll();

}
