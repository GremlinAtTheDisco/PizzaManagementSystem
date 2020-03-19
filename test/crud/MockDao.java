

package crud;

import dao.PizzaDao;
import dao.PizzaDaoImpl;
import java.util.List;
import model.Pizza;

public class MockDao implements PizzaDao  {
    
    private boolean called;

    public MockDao() {
        called = false;
    }
    
    

    @Override
    public void addPizza(Pizza p) {
        called = true;
    }

    @Override
    public void editPizza(Pizza p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePizza(Pizza p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pizza> getAllPizzas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isCalled() {
        return called;
    }

}
