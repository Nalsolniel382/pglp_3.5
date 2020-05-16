package fr.uvsq.exo3_5;

public class UneClasseMetier {
	
	
	

	private Affiche A;
	
	
	public UneClasseMetier(final Affiche A) {
		this.A = A;
	}
	
	public void afficheTraitementMetier()
	{
		A.afficheDebutMetier();
		// T r a i t em e n t s    mé t i e r s
		A.afficheFinMetier();
	}
	

}
