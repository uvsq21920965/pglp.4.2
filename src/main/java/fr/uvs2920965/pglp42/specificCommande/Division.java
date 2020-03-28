package fr.uvs2920965.pglp42.specificCommande;
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
   */
  public int apply(int a,int b) throws ArithmeticException  {
    if(b==0) {
      throw new ArithmeticException("division sur zéro");
    }else{
    	return a / b;
    }
  }
}
