package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IEstadoFacturasDao;
import ar.com.mycompany.dao.IFacturasDao;
import ar.com.mycompany.dao.IPedidoDao;
import ar.com.mycompany.daoImp.EstadoFacturasDao;
import ar.com.mycompany.daoImp.FacturasDao;
import ar.com.mycompany.daoImp.PedidoDao;
import ar.com.mycompany.entities.EstadoFacturas;
import ar.com.mycompany.entities.Facturas;
import ar.com.mycompany.entities.Pedidos;
import ar.com.mycompany.services.IFacturasService;

import java.util.List;


public class FacturasService implements IFacturasService {

    static IFacturasDao entityDao = new FacturasDao();
    static IEstadoFacturasDao estadoFacturasDao = new EstadoFacturasDao();
    static IPedidoDao pedido = new PedidoDao();

    public Facturas find(int idFacturas) {
        return entityDao.get(idFacturas);
    }

    public void save(Facturas entity) {
        entityDao.save(entity);
    }

    public String delete(Facturas entity) {
        return entityDao.delete(entity);
    }

    public List<Facturas> getAll() {
        return entityDao.getAll();
    }

    public List<EstadoFacturas> getListEstadoFacturas() {
        return estadoFacturasDao.getAll();
    }

    public EstadoFacturas findEstadoFacturasById(int idEstadoFacturas) {
        return estadoFacturasDao.get(idEstadoFacturas);
    }
    
    public List<Pedidos> getListPedidos() {
        return pedido.getAll();
    }

    public Pedidos findPedidosById(int idPedidos) {
        return pedido.get(idPedidos);
    }
}
