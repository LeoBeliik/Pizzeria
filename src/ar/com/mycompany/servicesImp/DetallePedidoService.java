package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IDetallePedidoDao;
import ar.com.mycompany.daoImp.DetallePedidoDao;
import ar.com.mycompany.entities.DetallePedidos;
import ar.com.mycompany.services.IDetallePedidoService;

import java.util.List;


public class DetallePedidoService implements IDetallePedidoService {

    static IDetallePedidoDao entityDao = new DetallePedidoDao();

    public DetallePedidos find(int idDetallePedido) {
        return entityDao.get(idDetallePedido);
    }

    public void save(DetallePedidos entity) {
        entityDao.save(entity);
    }

    public String delete(DetallePedidos entity) {
        return entityDao.delete(entity);
    }

    public List<DetallePedidos> getAll() {
        return entityDao.getAll();
    }
}
