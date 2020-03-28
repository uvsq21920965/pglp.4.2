package fr.uvs2920965.pglp42.specificCommande;

public class Addition implements  SpecificCommand {

	public Addition() {
	}
    public int apply(int a, int b) {
      return a+b;
    }
  }
