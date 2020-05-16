package fr.uvsq.exo3_5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	@Test
	public void test1()
	{	
		Affiche a = new Affiche();
		UneClasseMetier CM = new UneClasseMetier(a);
		CM.afficheTraitementMetier();
	}
}
