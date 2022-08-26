package fr.m2i.exemple.ws;

import fr.m2i.exemple.services.ExempleService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * Sample JAX-RS resources.
 *
 */
@Path("hello")
@RequestScoped
public class HelloResource {
	
	@Inject // cela indique que  le cdi lui inject l'instance en cours d'exécution au moment ou on utilise l'instance de la classe hello ressource
	private ExempleService es;
	
    
    @GET
    public String getMessage() {
       es.SayHello();
       return "Hello, world";
        
    }
    
}
