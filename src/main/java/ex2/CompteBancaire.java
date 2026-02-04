package ex2;

/**
 * Représente un compte bancaire
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    protected double solde;

    /**
     * @param solde
     */
    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        this.solde -= montant;
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

}
