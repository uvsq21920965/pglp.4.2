package fr.uvsq21920965.pglp42.specificommand;

/**
 * Soustraction Classe.
 * @author Sarra Belmahdi.
 *
 */
public class Soustraction implements  SpecificCommand {
  /**
   * Constructeur.
   */
  public Soustraction() {
  }

  /**
   * methode pour soustraire deux entiers.
   * @param a premiere operande.
   * @param b deuxieme operande.
   * @return le resultat de la soustraction.
   */
  public int apply(final int a, final int b) {
    return a - b;
  }
}
