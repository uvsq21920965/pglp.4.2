package fr.uvs2920965.pglp42.genericCommand;

public class Quit implements  GenericCommand{
	public Quit() {
	}
    public void apply() {
	  System.exit(0);
    }
  }
