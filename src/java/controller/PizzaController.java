package controller;

import dao.PizzaDaoImpl;
import java.util.Comparator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.Pizza;

@Named(value = "pizzaController")
@RequestScoped
public class PizzaController {

    @Inject
    PizzaDaoImpl pm;

    private String name;
    private Double price;
    private String description;
    private List<Pizza> allPizzas;

    public PizzaController() {

    }

    public void submit() {
        Pizza p = new Pizza(name, price, description);
        pm.addPizza(p);
        allPizzas = pm.getAllPizzas();
    }

    @PostConstruct
    public void fillArray() {
        this.allPizzas = pm.getAllPizzas();
        
        Comparator <Pizza> comp = (o1, o2) -> (o1.getPrice().compareTo(o2.getPrice()));     
        allPizzas.sort(comp);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Pizza> getAllPizzas() {
        return allPizzas;
    }

    public void setAllPizzas(List<Pizza> allPizzas) {
        this.allPizzas = allPizzas;
    }

}
