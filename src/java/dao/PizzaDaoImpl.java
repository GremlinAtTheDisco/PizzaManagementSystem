package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Pizza;

@RequestScoped
public class PizzaDaoImpl implements PizzaDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addPizza(Pizza p) {
        em.persist(p);
    }

    @Override
    public void editPizza(Pizza p) {
        em.merge(p);
    }

    @Override
    public void deletePizza(Pizza p) {
        em.remove(p);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        Query q = em.createQuery("SELECT p FROM Pizza p");
        return q.getResultList();
    }

}
