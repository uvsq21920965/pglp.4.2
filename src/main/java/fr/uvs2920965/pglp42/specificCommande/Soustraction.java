package fr.uvs2920965.pglp42.specificCommande;

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
   */
  public int apply(int a,int b) {
    return a-b;
  }
}
