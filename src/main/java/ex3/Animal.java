package ex3;

public class Animal {

    private String name;
    private TypeAnimal typeAnimal;
    private Comportement comportement;

    public Animal(String name, TypeAnimal typeAnimal, Comportement comportement) {
        this.name = name;
        this.typeAnimal = typeAnimal;
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return this.name + ' '+ this.typeAnimal + ' '+ this.comportement + ' ';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(TypeAnimal typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public Comportement getComportement() {
        return comportement;
    }

    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }
}
