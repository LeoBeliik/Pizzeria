package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IFacturasDao;
import ar.com.mycompany.entities.Facturas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class FacturasDao implements IFacturasDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public Facturas get(int idFacturas) {
        session = sessionFactory.openSession();
        Facturas entity = (Facturas) session.get(Facturas.class, idFacturas);
        session.close();
        return entity;
    }

    public void save(Facturas entity) {
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

    public String delete(Facturas entity) {
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

    public List<Facturas> getAll() {
        List<Facturas> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Facturas c order by c.numero");
        result = query.list();
        session.close();
        return result;
    }

}
