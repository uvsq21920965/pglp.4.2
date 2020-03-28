package fr.uvsq21920965.pglp42;

/**
 * CalculatriceRPN enum.
 * @author Sarra Belmahdi.
 *
 */
public enum CalculatriceRPN {;
    /**
     * main programme.
     * @param args
     * @throws ExpressionException exception déclanchée 
     * si l'expression post-fixée est erronée.
     */
	public static void main(String args[]) throws ExpressionException
	{
		SaisieRPN srpn=new SaisieRPN();
		srpn.interactUser();
	}

}
