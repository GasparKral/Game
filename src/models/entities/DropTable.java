package models.entities;

import models.items.Item;

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

}
