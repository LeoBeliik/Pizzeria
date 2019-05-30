package ar.com.mycompany.daoImp;
// @author Leo

import ar.com.mycompany.dao.IPizzaDao;
import ar.com.mycompany.entities.Pizzas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PizzaDao implements IPizzaDao {
    static SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
    Session session;

    public Pizzas get(int idPizzas) {
        session = sessionFactory.openSession();
        Pizzas entity = (Pizzas) session.get(Pizzas.class, idPizzas);
        session.close();
        return entity;
    }

    public void save(Pizzas entity) {
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

    public String delete(Pizzas entity) {
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

    public List<Pizzas> getAll() {
        List<Pizzas> result = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Pizzas c order by c.nombre");
        result = query.list();
        session.close();
        return result;
    }

}
