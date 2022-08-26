package fr.m2i.exemple.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped // classe généré par un conteneur de notre application qui est le conteneur Cdi
public class ExempleService {
	
	public void SayHello() {
		System.out.println("Mon service est appelé");
	}

}
