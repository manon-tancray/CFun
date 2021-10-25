package com.cfun.app.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.cfun.app.ChoixCouleur;
import com.cfun.app.Couleur;



class ChoixCouleurTest {
	
	@Test
	
	void testChoixCouleur() {
		//fail("Not yet implemented");
		
		//Arrange 
		
		double etatrouge = 1;
		double etatorange = 0.80;
		double etatvert = 0.20;
		
		//Act
		ChoixCouleur choixrouge = new ChoixCouleur(etatrouge);
		ChoixCouleur choixorange = new ChoixCouleur(etatorange);
		ChoixCouleur choixvert = new ChoixCouleur(etatvert);
		
		//Assert
		assertEquals(Couleur.rouge, choixrouge.getCouleur());
		assertEquals(Couleur.orange,choixorange.getCouleur());
		assertEquals(Couleur.vert, choixvert.getCouleur());
	}

}