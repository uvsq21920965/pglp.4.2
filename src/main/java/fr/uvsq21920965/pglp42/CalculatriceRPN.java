package fr.uvsq21920965.pglp42;

/**
 * CalculatriceRPN enumaration.
 * @author Sarra Belmahdi.
 *
 */
public enum CalculatriceRPN {
  /**
   * main programme.
   */
  main;
  /**
   * main programme.
   * @param args main program args.
   * @throws ExpressionException exception déclanchée.
   * si l'expression post-fixée est erronée.
   */
  public static void main(final String[] args)throws ExpressionException {
    SaisieRPN srpn = new SaisieRPN();
    srpn.interactUser();
  }
}
