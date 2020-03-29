package fr.uvsq21920965.pglp42;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import fr.uvsq21920965.pglp42.specificCommande.Addition;
import fr.uvsq21920965.pglp42.specificCommande.Division;
import fr.uvsq21920965.pglp42.specificCommande.Multiplication;
import fr.uvsq21920965.pglp42.specificCommande.Soustraction;
import fr.uvsq21920965.pglp42.specificCommande.SpecificCommand;

/**
 * Classe MoteurRPN pour traiter specific Commands.
 * @author Sarra Belmahdi.
 *
 */
public class MoteurRPN extends Interpreteur {
  /**
   * pile pour empiler les operandes.
   */
  private Stack<Integer> operandesPile;

  /**
   *  map pour enregistrer les specifiques commandes.
   */
  private Map<String, SpecificCommand> sCommands;
  /**
   * Constructeur.
   * @param operandesPileAtt pile pour empiler les operandes.
   */
  public MoteurRPN(final Stack<Integer> operandesPileAtt) {
    super(operandesPileAtt);
    operandesPile = operandesPileAtt;
    sCommands = new HashMap<String, SpecificCommand>();
    sCommands.put("+", new Addition());
    sCommands.put("-", new Soustraction());
    sCommands.put("*", new Multiplication());
    sCommands.put("/", new Division());
  }
  /**
   * methode pour acceder à la pile actuelle.
   * @return la pile des operandes.
   */
  public Stack<Integer> getOperandesPile() {
    return operandesPile;
  }

  /**
   * methode qui affiche le contenue de la pile des operandes.
   * @return le contenue  de la pile.
   */
  public String getAllOperandes() {
    StringBuilder all = new StringBuilder();
    all.append("[");
    if (!operandesPile.isEmpty()) {
      for (int i = 0; i < operandesPile.size(); i++) {
        if (i == 0) {
          all.append(operandesPile.get(i));
        } else {
          all.append(" ," + operandesPile.get(i));
        }
      }
    }
    return all + "]";
  }

  /**
   * methode pour empiler une opereandes.
   * @param a operande à stocker.
   */
  public void stockage(final int a) {
    this.getOperandesPile().push(a);
   this.storeLastOperation(this.getOperandesPile());
  }

  /**
   * methode pour executer les specifiques commandes selon l'operation.
   * @param op le nom de specifique commande.
   * @throws ExpressionException exception déclanchée.
   * si l'expression post-fixé est erronée.
   */
  public void calcule(final String op)throws ExpressionException {
    int operande1, operande2;
    SpecificCommand operation = null;
    if (operandesPile.size() >= 2) {
      operande1 = operandesPile.pop();
      operande2 = operandesPile.pop();
      operation = sCommands.get(op);
      stockage(operation.apply(operande2, operande1));
    } else {
      throw new ExpressionException("expression arithmethique non valide");
    }
  }
}
