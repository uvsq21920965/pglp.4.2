package specificCommandTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

import fr.uvsq21920965.pglp42.ExpressionException;
import fr.uvsq21920965.pglp42.MoteurRPN;

/**
 * MoteurRPNTest Classe.
 * @author Sarra Belmahdi.
 *
 */
public class MoteurRPNTest {
	Stack<Integer> operandesPile=new Stack<Integer>();
	Stack<Integer> expectedPile=new Stack<Integer>();
	
	@Test
	public void getOperandesPIleTest() {
		operandesPile.push(1);
		operandesPile.push(2);
		operandesPile.push(3);
		MoteurRPN mrpn = new MoteurRPN(operandesPile);
		assertEquals(mrpn.getOperandesPile(),operandesPile);;
	}

	@Test
	public void getAllOPerandes() {
		operandesPile.push(1);
		operandesPile.push(2);
		operandesPile.push(3);
		MoteurRPN mrpn = new MoteurRPN(operandesPile);
		assertEquals(mrpn.getAllOperandes(),"[1 ,2 ,3]");
	}

	@Test
	public void stockageTest() {
		operandesPile.push(1);
		operandesPile.push(2);
		operandesPile.push(3);
		MoteurRPN mrpn = new MoteurRPN(operandesPile);
		int a = 4;
		mrpn.stockage(a);
		assertTrue(mrpn.getOperandesPile().contains(4));
		a=mrpn.getOperandesPile().pop();
		assertEquals(a,4);
	}
	
	@Test
	public void calculeTest( ) throws ExpressionException {
		operandesPile.push(1);
		operandesPile.push(2);
		operandesPile.push(3);
		MoteurRPN mrpn = new MoteurRPN(operandesPile);
		mrpn.calcule("+");
		assertTrue(mrpn.getOperandesPile().contains(5));
		expectedPile.push(1);
		expectedPile.push(5);
		assertEquals(mrpn.getOperandesPile(),expectedPile);
		mrpn.calcule("-");
		assertTrue(mrpn.getOperandesPile().contains(4));
		expectedPile=new Stack<Integer>();
		expectedPile.push(4);
		assertEquals(mrpn.getOperandesPile(),expectedPile);
		
	}

}
