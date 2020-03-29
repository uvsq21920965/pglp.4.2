package genericCommandTest;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

import fr.uvsq21920965.pglp42.genericommand.Undo;

/**
 * classe pour tester undo Classe.
 * @author Sarra Belmahdi.
 *
 */
public class UndoTest {
	Stack<Integer> operandesPileT = new Stack<Integer>() ;
	Stack<Stack<Integer>> allPilesT = new Stack<Stack<Integer>>();
	/**
	 * methode pour copie le contene d'une pile.
	 * @param operandesPile la pile à copier. 
	 * @return la copie d'une pile.
	 */
	public Stack<Integer> copiePile(Stack<Integer> operandesPile) {
		  Stack<Integer> operandesPileCopie=new Stack<Integer>();
		  for(int i :operandesPile) {
			  operandesPileCopie.push(i);
		  }
		  return operandesPileCopie;
	}
	
	@Test
	public void applayUndoTest() {
		operandesPileT.push(1);
		allPilesT.push(copiePile(operandesPileT));
		operandesPileT.push(2);
		allPilesT.push(copiePile(operandesPileT));
		operandesPileT.push(3);
		allPilesT.push(copiePile(operandesPileT));
		Undo undoT = new Undo(operandesPileT,allPilesT);
		undoT.apply();
		Stack<Integer> expectePileT1 = new Stack<Integer>() ;
		expectePileT1.push(1);
		expectePileT1.push(2);
		assertEquals(operandesPileT,expectePileT1);
		undoT.apply();
		Stack<Integer> expectePileT2 = new Stack<Integer>() ;
		expectePileT2.push(1);
		assertEquals(operandesPileT,expectePileT2);
		undoT.apply();
		assertEquals(operandesPileT,new Stack<Integer>());
	}

}
