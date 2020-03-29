package specificCommandTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21920965.pglp42.specificommand.Addition;

/**
 * Addition Classe.
 * @author Sarra Belmahdi.
 */
public class AdditionTest {
	Addition add = new Addition();
	
	@Test
	public void ApplyTest() {
	  int a = 15;
	  int b = 5;
	  int c = add.apply(a, b);
	  assertEquals(c,15+5);
	}

}
