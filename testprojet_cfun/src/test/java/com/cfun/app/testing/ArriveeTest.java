package com.cfun.app.testing;

import static org.junit.jupiter.api.Assertions.*;


//import java.util.Calendar;

import org.junit.jupiter.api.Test;

import com.cfun.app.Arrivee;
import com.cfun.app.Complexe;

class ArriveeTest {
	
	@Test
	
	
	
	void testArrivee() {
		//fail("Not yet implemented");
		
		//Arrange

		double prix = 0;
		Complexe complexe = new Complexe(0,1,"CFun");
;		//get = méthode pour calculer cout 
		//appliquer get sur un objet pour determiner le cout 
		//quel objet ???
		//Arrivee ??
		
		//Act
		//creer méthode pour calculer le montant à partir de l'heur actuelle et qui return cout
		Arrivee arrivee = new Arrivee(complexe,'F');
		
		//Assert
		assertEquals(prix, arrivee.getMontant());
	}

}
