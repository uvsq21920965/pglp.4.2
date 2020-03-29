package fr.uvsq21920965.pglp42;

/**
 * CalculatriceRPN enumaration.
 * @author Sarra Belmahdi.
 *
 */
public enum CalculatriceRpn {
  /**
   * main programme.
   */
  MAIN;

  /**
   * methode pour executer.
   * @throws ExpressionException exception déclanchée si l'expression post-fixé est erronée.
   *
   */
  public void execute() throws ExpressionException {
    SaisieRpn srpn = new SaisieRpn();
    srpn.interactUser();
  }

  /**
   * main programme.
   * @param args main program args.
   * @throws ExpressionException exception déclanchée si l'expression post-fixée est erronée.
   */
  public static void main(final String[] args)throws ExpressionException {
    CalculatriceRpn.MAIN.execute();
  }
}
