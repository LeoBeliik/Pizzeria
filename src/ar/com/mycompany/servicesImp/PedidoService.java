package ar.com.mycompany.servicesImp;
// @author Leo

import ar.com.mycompany.dao.IEstadoPedidosDao;
import ar.com.mycompany.dao.IFacturasDao;
import ar.com.mycompany.dao.IPedidoDao;
import ar.com.mycompany.dao.IPizzaDao;
import ar.com.mycompany.daoImp.EstadoPedidosDao;
import ar.com.mycompany.daoImp.FacturasDao;
import ar.com.mycompany.daoImp.PedidoDao;
import ar.com.mycompany.daoImp.PizzaDao;
import ar.com.mycompany.entities.EstadoPedidos;
import ar.com.mycompany.entities.Facturas;
import ar.com.mycompany.entities.Pedidos;
import ar.com.mycompany.entities.Pizzas;
import ar.com.mycompany.services.IPedidoService;

import java.util.Date;
import java.util.List;


public class PedidoService implements IPedidoService {

    static IPedidoDao entityDao = new PedidoDao();
    static IEstadoPedidosDao estadoPedidoDao = new EstadoPedidosDao();
    static IPizzaDao pizzasDao = new PizzaDao();
    private static IFacturasDao facturasDao = new FacturasDao();

    public Pedidos find(int idPedidos) {
        return entityDao.get(idPedidos);
    }

    public void save(Pedidos entity) {
        entityDao.save(entity);
    }

    public String delete(Pedidos entity) {
        return entityDao.delete(entity);
    }

    public List<Pedidos> getAll() {
        return entityDao.getAll();
    }

    public List<EstadoPedidos> getListEstadoPedidos() {
        return estadoPedidoDao.getAll();
    }

    public EstadoPedidos findEstadoPedidosById(int idEstadoPedidos) {
        return estadoPedidoDao.get(idEstadoPedidos);
    }

    public List<Pizzas> getListPizzas() {
        return pizzasDao.getAll();
    }

    public Pizzas findPizzasById(int idPizzas) {
        return pizzasDao.get(idPizzas);
    }

    public List<Pedidos> getPedidos(Date desde, Date hasta) {
        return entityDao.getPedidos(desde, hasta);
    }

    @Override
    public void facturarPedido(Facturas entity) {
        entity.getPedido().setPendienteFactura(false);
        facturasDao.save(entity);
    }

}
