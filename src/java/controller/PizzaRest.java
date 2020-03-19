

package controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import logic.PizzaManager;
import model.Pizza;

@Path("Pizza")
@Stateless
public class PizzaRest {
    
    @Inject
    PizzaManager pm;
    
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void addPizza (Pizza p) {
        pm.addPizza(p);
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void editPizza (Pizza p) {
        pm.editPizza(p);
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Pizza> getAllPizzas () {
        return pm.getPizzas();
    }
    
    @DELETE
    public void deletePizza(Pizza p) {
        pm.removePizza(p);
    }
    

}
