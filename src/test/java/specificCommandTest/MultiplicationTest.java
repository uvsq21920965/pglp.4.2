package specificCommandTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvs2920965.pglp42.specificCommande.Multiplication;

/**
 * Multiplication Classe.
 * @author Sarra Belmahdi.
 */
public class MultiplicationTest {
	Multiplication mul = new Multiplication();
	@Test
	public void applyTest( ) {
	 int a = 15;
	 int b = 5;
	 int c = mul.apply(a, b);
	 assertEquals(c,15*5);
	}
}
