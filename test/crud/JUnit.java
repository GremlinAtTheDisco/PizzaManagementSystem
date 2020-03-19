
package crud;

import controller.PizzaController;
import dao.PizzaDao;
import logic.PizzaManager;
import model.Pizza;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnit {
     
   
     PizzaDao mockDao;
     PizzaManager pm;
     Pizza pizza;
    
        
    @Before
    public void setUp() {
        pm = new PizzaManager();
        mockDao = new MockDao();
        pm.setDao(mockDao);
        pizza = new Pizza("PizzaName", 65.00, "Description");
    }
    
    @Test
    public void addPizzaTest () {
        pm.addPizza(pizza);
        assertTrue(((MockDao)mockDao).isCalled());
    } 

}
