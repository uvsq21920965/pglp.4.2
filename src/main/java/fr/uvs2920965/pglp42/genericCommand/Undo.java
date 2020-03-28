package fr.uvs2920965.pglp42.genericCommand;

import java.util.Stack;

public class Undo implements  GenericCommand{
	private Stack<Integer> operandesPile;
	private Stack<Stack<Integer>> allPiles;
	public Undo(Stack<Integer> operandesPileAtt, Stack<Stack<Integer>> allPilesAtt) {
		operandesPile = operandesPileAtt;
		allPiles=allPilesAtt;
	}
   public void apply() {
   	while (!operandesPile.empty()) {
   		operandesPile.pop();
		}
		if (! allPiles.empty()) {
		  allPiles.pop();
		  if (! allPiles.empty()) {
		    Stack<Integer> list1 =  allPiles.peek();
			for (int i = 0; i < list1.size(); i++) {
			  if (list1.get(i) != null) {
			    operandesPile.push(list1.get(i));
			  }
			}
		  }
		}else {
   		System.out.println("il n'y a pas une operation à annuler");
   	}
   }
 }
