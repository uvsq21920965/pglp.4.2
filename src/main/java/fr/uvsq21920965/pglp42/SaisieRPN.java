package fr.uvsq21920965.pglp42;

import java.util.Scanner;
import java.util.Stack;

/**
 * SaisieRPN Classe pour gerer user input.
 * @author Sarra Belmahdi.
 *
 */
public class SaisieRPN {
  /**
   * pile pour empiler les operandes.
   */
  private Stack<Integer> operandesPile;

  /**
   * reference au objet mrpn.
   */
  private MoteurRPN mrpn;

  /**
   * Constructeur.
   */
  public SaisieRPN() {
    operandesPile = new Stack<Integer>();
    mrpn = new MoteurRPN(operandesPile);
  }

  /**
   * methode pour acceder à la pile actuelle.
   * @return la pile des operandes.
   */
  public Stack<Integer> getOperandesPile() {
    return operandesPile;
  }
  /**
   * methode qui manipule la saisie d'utilisateur.
   * @throws ExpressionException exception déclanchée.
   * si l'expression post-fixée est erronée.
   */
  public void interactUser() throws ExpressionException {
    System.out.println("");
    System.out.println("-------------------------------------------------");
    System.out.println("               CALCULATRICE RPN");
    System.out.println("-------------------------------------------------");
    System.out.println("");
    System.out.println("Ecrire votre operation post-fixée svp ,'exit' pour "
      + "sortir ou 'undo' pour annuler une operation: ");
    Scanner scan = new Scanner(System.in);
    // attribut entier pour recuperer les operandes entrer par l'utilisateur
    int number;
    // attribut string pour recuperer les operations entrer par l'utilisateur
    String op = " ";
    while (true) {
      if (scan.hasNextInt()) {
        number = scan.nextInt();
        mrpn.stockage(number);
      } else {
        op = scan.next().trim();
        if (op.equals("exit") || op.equals("undo")) {
          if (op.equals("exit")) {
            scan.close();
          }
          mrpn.interprete(op);
        } else {
              if (!op.equals("+") && !op.equals("-")
                && !op.equals("/") && !op.equals("*")) {
                System.out.println("Operation Invalide");
              } else {
                mrpn.calcule(op);
              }
            }
          }
      System.out.println(mrpn.getAllOperandes());
    }
  }
}
