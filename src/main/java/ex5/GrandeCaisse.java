package ex5;

import java.util.List;

public class GrandeCaisse extends Caisse {
    /**
     * Constructeur
     *
     */
    public GrandeCaisse() {
        super();
    }

    /**
     * set items with weight verification
     * @param items the items to set
     */
    @Override
    public void setItems(List<Item> items) {
        for (Item i : items) {
           addItem(i);
        }
    }

    /**
     * add an item with weight verification
     * @param i
     */
    public void addItem(Item i){
        if(i.getPoids() > 20) {
            this.items.add(i);
        }
    }
}
