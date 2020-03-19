

package logic;

import dao.PizzaDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import model.Pizza;

@Stateless
public class PizzaManager {
    
    @Inject
    private PizzaDao dao;
    
    public void addPizza (Pizza p) {
        dao.addPizza(p);
    }
    
    public void editPizza (Pizza p) {
        dao.editPizza(p);
    }
    
    public void removePizza (Pizza p) {
        dao.deletePizza(p);
    }
    
    public List<Pizza> getPizzas () {
        return dao.getAllPizzas();
    }

    public void setDao(PizzaDao dao) {
        this.dao = dao;
    }
    
    

}
