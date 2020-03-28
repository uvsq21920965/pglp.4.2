package genericCommandTest;
import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import fr.uvs2920965.pglp42.Interpreteur;

/**
 * Classe pour tester InterpreteurClasse.
 * @author Sarra Belmahdi.
 *
 */
public class InterpreteurTest {
  Stack<Integer> operandesPile=new Stack<Integer>();
  Interpreteur inter;
  @Rule
  public final ExpectedSystemExit exit = ExpectedSystemExit.none();
  @Test
  public void interpreteTest() {
	  operandesPile.push(1);
	  operandesPile.push(2);
	  operandesPile.push(3);
	  inter=new Interpreteur(operandesPile);
	  inter.storeLastOperation(operandesPile);
	  inter.interprete("undo");
	  assertEquals(inter.getOperandesPile(),new Stack<Integer>());
	  exit.expectSystemExitWithStatus(0);
	  inter.interprete("exit");
	  System.out.println("This is NEVER executed.");
  }

}
