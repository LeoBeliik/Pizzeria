package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IEstadoFacturasDao;
import ar.com.mycompany.daoImp.EstadoFacturasDao;
import ar.com.mycompany.entities.EstadoFacturas;
import ar.com.mycompany.services.IEstadoFacturasService;

import java.util.List;


public class EstadoFacturasService implements IEstadoFacturasService {

    static IEstadoFacturasDao entityDao = new EstadoFacturasDao();

    public EstadoFacturas find(int idEstadoFacturas) {
        return entityDao.get(idEstadoFacturas);
    }

    public void save(EstadoFacturas entity) {
        entityDao.save(entity);
    }

    public String delete(EstadoFacturas entity) {
        return entityDao.delete(entity);
    }

    public List<EstadoFacturas> getAll() {
        return entityDao.getAll();
    }
}
