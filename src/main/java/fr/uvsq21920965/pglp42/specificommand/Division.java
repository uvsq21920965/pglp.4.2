package fr.uvsq21920965.pglp42.specificommand;
/**
 * Division Classe.
 * @author Sarra Belmahdi.
 *
 */

public class Division implements  SpecificCommand {
  /**
   * Constructeur.
   */
  public Division() {
  }

  /**
   * methode pour diviser deux entiers.
   * @param a premiere operande.
   * @param b deuxieme operande.
   * @return le resultat du division.
   * @throws ArithmeticException déclanchée si il ya une division par zéro.
   */
  public int apply(final int a, final int b)throws ArithmeticException  {
    if (b == 0) {
      throw new ArithmeticException("division sur zéro");
    } else {
      return a / b;
    }
  }
}
