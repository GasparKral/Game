package models.entities;

import models.items.Item;
import models.enums.ItemsRarity;

import java.util.ArrayList;
import java.util.List;

public class DropTable {

    private ArrayList<Item> drops = new ArrayList<Item>();

    public ArrayList<Item> getDrops() {
        return drops;
    }

    public void addDrop(Item drop) {
        drops.add(drop);
    }

    public void fillDropTable(Item[] dropTable) {
        this.drops = new ArrayList<Item>(List.of(dropTable));
    }

    public Item getRandomDrop() {
        int randomIndex = (int) (Math.floor(Math.random() * this.drops.size()));
        return this.drops.get(randomIndex);
    }

    public Item getItemByRarity(ItemsRarity rarity) {
        return this.drops.stream().filter(item -> item.getRarity() == rarity).findAny().orElse(getRandomDrop());
    }

}
