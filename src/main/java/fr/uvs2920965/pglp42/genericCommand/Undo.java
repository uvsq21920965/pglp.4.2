package fr.uvs2920965.pglp42.genericCommand;

import java.util.Stack;
/**
 * Undo Class pour annuler la dernierre operation effectuee.
 * @author Sarra Belmahdi.
 *
 */
public class Undo implements  GenericCommand{
  /**
   * pile pour empiler les operandes.
   */
  private Stack<Integer> operandesPile;

  /**
   * pile pour empiler l'historiques des piles.
   */
  private Stack<Stack<Integer>> allPiles;
 
  /**
   * Constructeur.
   * @param operandesPileAtt pile pour empiler les operandes.
   * @param allPilesAtt  pile pour empiler l'historiques des piles.
   */
  public Undo(Stack<Integer> operandesPileAtt, Stack<Stack<Integer>> allPilesAtt) {
    operandesPile = operandesPileAtt;
    allPiles=allPilesAtt;
  }

  /**
   * methode pour annuler la derniere operation effectée.
   */
  public void apply() {
    while (!operandesPile.empty()) {
     operandesPile.pop();
    }
    if (! allPiles.empty()) {
      allPiles.pop();
        if (! allPiles.empty()) {
          Stack<Integer> actuelPile =  allPiles.peek();
          for (int i = 0; i < actuelPile.size(); i++) {
            if (actuelPile.get(i) != null) {
              operandesPile.push(actuelPile.get(i));
            }
          }
        }
      }
      else {
        System.out.println("il n'y a pas une operation à annuler");
    }
  }
}
