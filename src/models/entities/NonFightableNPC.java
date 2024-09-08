package models.entities;

import models.interfaces.Interactable;

public abstract class NonFightableNPC extends Entitie implements  Interactable {

    private Inventory inventory = new Inventory();

}
