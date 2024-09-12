package models.items;

import models.enums.ItemsRarity;

public abstract class Item {

    private String name;
    private ItemsRarity rarity;

    public Money price;

    public void setRarity(ItemsRarity rarity) {
        this.rarity = rarity;
    }

    public ItemsRarity getRarity() {
        return this.rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
