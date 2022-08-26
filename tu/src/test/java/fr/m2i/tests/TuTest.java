package fr.m2i.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import fr.m2i.logique.Addition;
import fr.m2i.logique.Division;
import fr.m2i.logique.HelloWorld;
import fr.m2i.logique.Multiplication;
import fr.m2i.logique.Puissance;
import fr.m2i.logique.Soustraction;

public class TuTest {
	
	@Test
	void sayHelloTest() {
		
		//Arrange
		String resultatAttendu = "Hello, the world";
		HelloWorld hw = new HelloWorld();
		
		
		
		//Act
		
		String resultatObtenu = hw.sayHello();
		
		
		//Assert
		
		assertEquals(resultatAttendu,resultatObtenu);
		
		//fail("Non fonctionnel");
	}
	
	@Test
	void addition() {
		
		//Arrange
		double resultatAttendu = 4;
		Addition add = new Addition();
		
		
		
		//Act
		
		double resultatObtenu = add.add(2,2);
		
		
		//Assert
		assertEquals(resultatAttendu,resultatObtenu);
	}
	
	@Test
	void soustraction() {
		//Arrange
		double resultatAttendu = 4;
		Soustraction sous = new Soustraction();
		
		
		
		//Act
		
		double resultatObtenu = sous.sous(6,2);
		
		
		//Assert
		assertEquals(resultatAttendu,resultatObtenu);
	}
	
	@Test
	void division() {
		//Arrange
		double resultatAttendu = 1;
		Division div = new Division();
		
		
		
		//Act
		
		double resultatObtenu = div.div(2,2);
		
		
		//Assert
		assertEquals(resultatAttendu,resultatObtenu);
	}
	
	@Test
	void multiplication() {
		//Arrange
		double resultatAttendu = 4;
		Multiplication mult= new Multiplication();
		
		
		
		//Act
		
		double resultatObtenu = mult.mult(2,2);
		
		
		//Assert
		assertEquals(resultatAttendu,resultatObtenu);
	}
	
	@Test
	void puissance() {
		//Arrange
		double resultatAttendu = 9;
		Puissance pui = new Puissance();
		
		
		
		//Act
		
		double resultatObtenu = pui.pui(3,2);
		
		
		//Assert
		assertEquals(resultatAttendu,resultatObtenu);
	}
	
	
	
	
}
