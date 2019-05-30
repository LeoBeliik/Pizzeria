package ar.com.mycompany.dao;
// @author Leo

import ar.com.mycompany.entities.Facturas;

import java.util.List;

public interface IFacturasDao {

    Facturas get(int idFacturas);

    void save(Facturas entity);

    String delete(Facturas entity);

    List<Facturas> getAll();

}
