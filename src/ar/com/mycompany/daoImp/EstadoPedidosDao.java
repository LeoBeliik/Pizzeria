package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IEstadoPedidosDao;
import ar.com.mycompany.entities.EstadoPedidos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EstadoPedidosDao implements IEstadoPedidosDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public EstadoPedidos get(int idEstadoPedidos) {
        session = sessionFactory.openSession();
        EstadoPedidos entity = (EstadoPedidos) session.get(EstadoPedidos.class, idEstadoPedidos);
        session.close();
        return entity;
    }

    public void save(EstadoPedidos entity) {
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

    public String delete(EstadoPedidos entity) {
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

    public List<EstadoPedidos> getAll() {
        List<EstadoPedidos> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from EstadoPedidos c order by c.nombreEstadoPedidos");
        result = query.list();
        session.close();
        return result;
    }

}
