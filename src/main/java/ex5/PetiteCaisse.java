package ex5;

import java.util.List;

public class PetiteCaisse extends Caisse{
    /**
     * Constructeur
     *
     */
    public PetiteCaisse() {
        super();
    }

    /**
     * set the items with weight verification
     * @param items the items to set
     */
    @Override
    public void setItems(List<Item> items) {
        for (Item i : items) {
            addItem(i);
        }
    }

    /**
     * set an item with weight verification
     * @param item
     */
    public void addItem(Item item) {
        if (item.getPoids() < 5) {
            this.items.add(item);
        }
    }
}
