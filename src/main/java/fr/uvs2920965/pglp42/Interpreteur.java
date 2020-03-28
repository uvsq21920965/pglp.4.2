package fr.uvs2920965.pglp42;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import fr.uvs2920965.pglp42.genericCommand.GenericCommand;
import fr.uvs2920965.pglp42.genericCommand.Quit;
import fr.uvs2920965.pglp42.genericCommand.Undo;

public class Interpreteur {
  private Stack<Integer> operandesPile;
  private Stack<Stack<Integer>> allPiles;
  private Map<String,GenericCommand> gCommands;
	  
  public Interpreteur(Stack<Integer> operandesPileAtt) {
	    operandesPile = operandesPileAtt;
	    allPiles=new Stack<Stack<Integer>>();
	    gCommands=new HashMap<String , GenericCommand>();
	    gCommands.put("exit",new Quit());
	    gCommands.put("undo",new Undo(operandesPile,allPiles));
	  }
  
  public void interprete(String operation) {
    GenericCommand gc =gCommands.get(operation);
    gc.apply();
  }
  public  void  storeLastOperation(Stack<Integer> operandesPile) {
	  Stack<Integer> operandesPileCopie=new Stack<Integer>();
	  for(int i :operandesPile) {
		  operandesPileCopie.push(i);
	  }
     allPiles.push(operandesPileCopie);
  }
 
}
