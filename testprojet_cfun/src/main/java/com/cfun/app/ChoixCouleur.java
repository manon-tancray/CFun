package com.cfun.app;

/*modification du code ajout orange vert*/
public class ChoixCouleur {
	private Couleur couleur;
	/*taux d’utilisation*/
	/*< 70%*/
	public ChoixCouleur(final double etat) {
		if(etat < 0.7) {
			couleur = Couleur.vert;
		} 
		else if (etat > 0.7 && etat < 1) { /*Entre 70 et 100%*/
			couleur = Couleur.orange;
		}
		else {/*= 100%*/
			couleur = Couleur.rouge;
		}
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
}