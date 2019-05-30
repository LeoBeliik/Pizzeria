package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IEstadoFacturasDao;
import ar.com.mycompany.entities.EstadoFacturas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EstadoFacturasDao implements IEstadoFacturasDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public EstadoFacturas get(int idEstadoFacturas) {
        session = sessionFactory.openSession();
        EstadoFacturas entity = (EstadoFacturas) session.get(EstadoFacturas.class, idEstadoFacturas);
        session.close();
        return entity;
    }

    public void save(EstadoFacturas entity) {
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

    public String delete(EstadoFacturas entity) {
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

    public List<EstadoFacturas> getAll() {
        List<EstadoFacturas> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from EstadoFacturas c order by c.nombre");
        result = query.list();
        session.close();
        return result;
    }

}
