package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IEstadoPedidosDao;
import ar.com.mycompany.daoImp.EstadoPedidosDao;
import ar.com.mycompany.entities.EstadoPedidos;
import ar.com.mycompany.services.IEstadoPedidosService;

import java.util.List;


public class EstadoPedidosService implements IEstadoPedidosService {

    static IEstadoPedidosDao entityDao = new EstadoPedidosDao();

    public EstadoPedidos find(int idEstadoPedidos) {
        return entityDao.get(idEstadoPedidos);
    }

    public void save(EstadoPedidos entity) {
        entityDao.save(entity);
    }

    public String delete(EstadoPedidos entity) {
        return entityDao.delete(entity);
    }

    public List<EstadoPedidos> getAll() {
        return entityDao.getAll();
    }
}
