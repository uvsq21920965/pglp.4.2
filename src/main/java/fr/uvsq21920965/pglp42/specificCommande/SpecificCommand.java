package fr.uvsq21920965.pglp42.specificCommande;

/**
 * SpecificCommand Interface.
 * @author Sarra Belmahdi.
 *
 */
public interface SpecificCommand {
  /**
   * appliquer une commande specifique +,-,*,/.
   * @param a premiere operande.
   * @param b deuxieme operande.
   * @return le resultat de l'operation.
   */
  int apply(int a, int b);

}
