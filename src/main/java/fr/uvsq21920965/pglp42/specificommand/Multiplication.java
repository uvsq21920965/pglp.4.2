package fr.uvsq21920965.pglp42.specificommand;

/**
 * Multiplication classe.
 * @author Sarra Belmahdi.
 */
public class Multiplication implements  SpecificCommand {

  /**
   * Constructeur.
   */
  public Multiplication() {
  }

  /**
   * methode pour multiplier deux entiers.
   * @param a premiere operande.
   * @param b deuxieme operande.
   * @return le resultat de multiplication.
   */
  public int apply(final int a, final int b) {
    return a * b;
  }
}
