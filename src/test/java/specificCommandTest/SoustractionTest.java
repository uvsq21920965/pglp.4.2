package specificCommandTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21920965.pglp42.specificCommande.Soustraction;

/**
 * Soustraction Class.
 * @author Sarra Belmahdi 
 */
public class SoustractionTest {
	Soustraction sous = new Soustraction();
	
	@Test
	public void applyTest() {
		int a=15;
		int b=5;
		int c = sous.apply(a, b);
		assertEquals(c,15-5);
	}

}
