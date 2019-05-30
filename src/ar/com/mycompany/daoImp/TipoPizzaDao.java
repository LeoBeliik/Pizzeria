package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.ITipoPizzaDao;
import ar.com.mycompany.entities.TipoPizzas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class TipoPizzaDao implements ITipoPizzaDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public TipoPizzas get(int idTipoPizza) {
        session = sessionFactory.openSession();
        TipoPizzas entity = (TipoPizzas) session.get(TipoPizzas.class, idTipoPizza);
        session.close();
        return entity;
    }

    public void save(TipoPizzas entity) {
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

    public String delete(TipoPizzas entity) {
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

    public List<TipoPizzas> getAll() {
        List<TipoPizzas> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from TipoPizzas c order by c.nombre");
        result = query.list();
        session.close();
        return result;
    }

}
