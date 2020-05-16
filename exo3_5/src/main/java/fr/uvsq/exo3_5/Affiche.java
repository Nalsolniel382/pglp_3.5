package fr.uvsq.exo3_5;


import java.time.LocalDateTime;

public class Affiche implements InterfaceAffiche {
	
	

	public void afficheDebutMetier() {
		
		System.out.println(LocalDateTime.now() + "Début de afficheDebut");
	}
	
	
	public void afficheFinMetier() {
		System.out.println(LocalDateTime.now() + "Début de afficheFin");
	}


}
