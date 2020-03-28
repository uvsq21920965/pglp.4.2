package fr.uvs2920965.pglp42.specificCommande;


public class Multiplication implements  SpecificCommand {
	  public Multiplication() {
    }
	  public int apply(int a,int b) {
	      return a*b;
	    }
}
