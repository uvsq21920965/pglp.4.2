package specificCommandTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.uvs2920965.pglp42.specificCommande.Division;

/**
 * DivisionTest Class.
 * @author Sarra Belmahd.
 *
 */
public class DivisionTest {
  Division div =  new Division();

  @Test
  public void applyTest1() {
    int a = 15;
    int b = 5;
    int c=div.apply(a, b);
    assertEquals(c,15/5);
  }

  @Test(expected = ArithmeticException.class)
  public void applyTest2() {
    int a = 5;
    int b = 0;
    div.apply(a,b);
  }
}
