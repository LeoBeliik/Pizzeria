package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IVariedadPizzaDao;
import ar.com.mycompany.entities.VariedadPizzas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class VariedadPizzaDao implements IVariedadPizzaDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public VariedadPizzas get(int idVariedadPizza) {
        session = sessionFactory.openSession();
        VariedadPizzas entity = (VariedadPizzas) session.get(VariedadPizzas.class, idVariedadPizza);
        session.close();
        return entity;
    }

    public void save(VariedadPizzas entity) {
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

    public String delete(VariedadPizzas entity) {
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

    public List<VariedadPizzas> getAll() {
        List<VariedadPizzas> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from VariedadPizzas c order by c.nombre");
        result = query.list();
        session.close();
        return result;
    }

}
