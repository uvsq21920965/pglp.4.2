package genericCommandTest;

import org.junit.Rule;
import org.junit.Test;

import fr.uvsq21920965.pglp42.genericommand.Quit;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;
/**
 * Quite teste Classe.
 * @author Sarra Belmahdi.
 *
 */
public class QuitTest {
 Quit q = new Quit();
 
 @Rule
 public final ExpectedSystemExit exit = ExpectedSystemExit.none();
 
 @Test
 public void applyQuitTest() {
   exit.expectSystemExitWithStatus(0);
   q.apply();
   System.out.println("This is NEVER executed.");
 }
}
