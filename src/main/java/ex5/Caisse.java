package ex5;

import java.util.ArrayList;
import java.util.List;

public abstract class Caisse {

    protected List<Item> items;

    /**
     * Constructeur
     *
     */
    public Caisse() {
        super();
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public abstract void addItem(Item item);

}
