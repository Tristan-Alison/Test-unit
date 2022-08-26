package fr.m2i.exemple.backed;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * Sample Backing Bean for JavaServer Faces.
 *
 */
@Named
@RequestScoped
public class HelloBean {

    public String getMessage() {
        return "Hello, world";
    }
    
}
