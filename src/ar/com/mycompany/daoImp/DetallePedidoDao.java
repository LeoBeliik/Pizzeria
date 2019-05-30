package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IDetallePedidoDao;
import ar.com.mycompany.entities.DetallePedidos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DetallePedidoDao implements IDetallePedidoDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public DetallePedidos get(int idDetallePedido) {
        session = sessionFactory.openSession();
        DetallePedidos entity = (DetallePedidos) session.get(DetallePedidos.class, idDetallePedido);
        session.close();
        return entity;
    }

    public void save(DetallePedidos entity) {
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

    public String delete(DetallePedidos entity) {
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

    public List<DetallePedidos> getAll() {
        List<DetallePedidos> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from DetallePedidos c order by c.precioPedidos");
        result = query.list();
        session.close();
        return result;
    }

}
