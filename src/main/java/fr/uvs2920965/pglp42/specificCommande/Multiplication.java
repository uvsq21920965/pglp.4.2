package fr.uvs2920965.pglp42.specificCommande;

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
   */
  public int apply(int a,int b) {
    return a*b;
  }
}
