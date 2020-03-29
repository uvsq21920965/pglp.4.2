package fr.uvsq21920965.pglp42.genericommand;

/**
 * quite Class pour quiter le programme.
 * @author Sarra Belmahdi.
 *
 */
public class Quit implements  GenericCommand {
  /**
   * Constructeur.
   */
  public Quit() {
  }

  /**
   * methode pour fermer le programme.
   */
  public void apply() {
    Runtime.getRuntime().exit(0);
  }
}
