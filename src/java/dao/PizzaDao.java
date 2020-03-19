package dao;

import java.util.List;
import model.Pizza;

public interface PizzaDao {

    public void addPizza(Pizza p);

    public void editPizza(Pizza p);

    public void deletePizza(Pizza p);

    public List<Pizza> getAllPizzas();
}
