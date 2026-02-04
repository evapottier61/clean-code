package ex3;

public class Animal {

    private String name;
    private TypeAnimal typeAnimal;
    private Regime regime;

    public Animal(String name, TypeAnimal typeAnimal, Regime regime) {
        this.name = name;
        this.typeAnimal = typeAnimal;
        this.regime = regime;
    }

    @Override
    public String toString() {
        return this.name + ' '+ this.typeAnimal + ' '+ this.regime + ' ';
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

    public Regime getComportement() {
        return regime;
    }

    public void setComportement(Regime regime) {
        this.regime = regime;
    }
}
