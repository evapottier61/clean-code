package ex2;

/**
 * Représente un compte bancaire de type Livret A
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération du livret A
     */
    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * apply annual remuneration on the Livret A
     *
     */
    public void appliquerRemuAnnuelle() {
        var s = this.solde;
        this.solde += solde * tauxRemuneration / 100;
    }

    /**
     * remove the amount on the solde if this is possible
     * @param montant
     */
    public void debiterMontant(double montant) {
        if(this.getSolde() < montant) {
            return;
        }
        super.debiterMontant(montant);
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

}
