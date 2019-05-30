package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IPedidoDao;
import ar.com.mycompany.entities.Pedidos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.List;

public class PedidoDao implements IPedidoDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public Pedidos get(int idPedidos) {
        session = sessionFactory.openSession();
        Pedidos entity = (Pedidos) session.get(Pedidos.class, idPedidos);
        session.close();
        return entity;
    }

    public void save(Pedidos entity) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
        }

    }

    public String delete(Pedidos entity) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            session.delete(entity);
            session.getTransaction().commit();
            session.close();
            return null;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return e.getMessage().toString();
        }

    }

    public List<Pedidos> getAll() {
        List<Pedidos> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Pedidos c order by c.nombreCliente");
        result = query.list();
        session.close();
        return result;
    }

    public List<Pedidos> getPedidos(Date desde, Date hasta) {
        List<Pedidos> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Pedidos c where c.fechaHoraCreacion between :desde and :hasta order by c.fechaHoraCreacion");
        query.setParameter("desde", desde);
        query.setParameter("hasta", hasta);
        result = query.list();
        session.close();
        return result;
    }
}
