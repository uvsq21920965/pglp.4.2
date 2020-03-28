package fr.uvs2920965.pglp42.specificCommande;

public class Division implements  SpecificCommand {
    public Division() {
	}

    public int apply(int a,int b) {
    	if(b!=0) {
	        return a / b;
	      }
	      else{
		    throw new ArithmeticException("division sur zéro");
	      }
	    }
}
