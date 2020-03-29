package fr.uvsq21920965.pglp42.specificommand;
/**
 * Addition Classe.
 * @author Sarra Belmahdi.
 *
 */

public class Addition implements  SpecificCommand {

  /**
   * Constructeur.
   */
  public Addition() {
  }

  /**
   * methode pour aditionner deux entiers.
   * @param a premiere operande.
   * @param b deuxieme operande.
   * @return le resultat d'addition.
   */
  public int apply(final int a, final int b) {
    return a + b;
  }
}
