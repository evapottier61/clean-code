package ex3;

import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animals;


    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void afficherListeAnimaux() {
        for (Animal a: animals) {
            a.toString();
        }
    }

    public int taille() {
        return animals.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
