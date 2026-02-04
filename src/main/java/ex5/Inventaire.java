package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    /**
     * List of different caisses
     */
    private List<Caisse> caisses;

    /**
     * create a new inventory
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new PetiteCaisse());
        caisses.add(new MoyenneCaisse());
        caisses.add(new GrandeCaisse());
    }

    /**
     * add an item in the good caisse
     * @param item item to add
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            caisse.addItem(item);
        }
    }

    /**
     * get the size of all items of all caisses
     * @return the size
     */
    public int taille() {
        var res = 0;
        for (Caisse caisse : caisses) {
            for(Item item : caisse.getItems()) {
                res += item.getPoids();
            }
        }
        return res;
    }
}
