package ex2;
/**
 * Représente un compte bancaire de type Compte Courant
 */
public class CompteCourant extends CompteBancaire{

    /**
     * decouvert : un découvert du compte courant
     */
    private double decouvert;

    /**
     * @param solde
     * @param decouvert
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /**
     * Getter for decouvert
     *
     * @return decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * setter for decouvert
     *
     * @param decouvert
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * remove the amount in parameters, update decouvert if it's necessary
     * @param montant
     */
    public void debiterMontant(double montant){
        if(this.getSolde() < montant){
            this.setDecouvert(this.getDecouvert()+ (this.getSolde() - montant));
        }
        super.debiterMontant(montant);
    }
}
