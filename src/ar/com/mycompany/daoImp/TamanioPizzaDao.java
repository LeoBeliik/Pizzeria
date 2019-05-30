package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.ITamanioPizzaDao;
import ar.com.mycompany.entities.TamanioPizzas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import javax.swing.JOptionPane;

public class TamanioPizzaDao implements ITamanioPizzaDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public TamanioPizzas get(int idTamanioPizza) {
        session = sessionFactory.openSession();
        TamanioPizzas entity = (TamanioPizzas) session.get(TamanioPizzas.class, idTamanioPizza);
        session.close();
        return entity;
    }

    public void save(TamanioPizzas entity) {
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

    public String delete(TamanioPizzas entity) {
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

    public List<TamanioPizzas> getAll() {
        List<TamanioPizzas> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from TamanioPizzas c order by c.nombre");
        result = query.list();
        session.close();
        return result;
    }

}
