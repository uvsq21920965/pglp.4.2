package fr.uvs2920965.pglp42.specificCommande;


public class Soustraction implements  SpecificCommand {
	  public Soustraction() {
    }
	  public int apply(int a,int b) {
	      return a-b;
	    }
}
