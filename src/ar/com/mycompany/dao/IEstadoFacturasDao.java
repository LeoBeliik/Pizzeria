package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.EstadoFacturas;

import java.util.List;

public interface IEstadoFacturasDao {

    EstadoFacturas get(int idEstadoFacturas);

    void save(EstadoFacturas entity);

    String delete(EstadoFacturas entity);

    List<EstadoFacturas> getAll();

}
