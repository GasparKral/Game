package models.entities.non_npcs;

import models.entities.Entitie;
import models.entities.Inventory;

public class PCharacter extends Entitie {

    private Inventory inventory = new Inventory();
    private Integer sanity = null;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Integer getSanity() {
        return this.sanity;
    }

    public void setSanity(Integer sanity) {
        this.sanity = sanity;
    }

    public PCharacter sanity(Integer sanity) {
        setSanity(sanity);
        return this;
    }

}
