package models.entities;

import models.items.Item;
import models.items.Money;

import java.util.Arrays;

public class Inventory {

    final Item[] inventorySlots = new Item[50];
    final Money accountMoney = new Money();

    public void sellItem(Item itemToSell, Inventory targetInventory) {

        Arrays.stream(inventorySlots).filter(item -> item == itemToSell).findFirst().ifPresent(item -> {
            accountMoney.add(targetInventory.accountMoney.pay(item.price));
            inventorySlots[Arrays.asList(inventorySlots).indexOf(item)] = null;
        });

    }

    public void buyItem(Item itemToBuy, Inventory targetInventory) {

        Arrays.stream(targetInventory.inventorySlots).filter(item -> item == itemToBuy).findFirst().ifPresent(item -> {
            targetInventory.accountMoney.add(this.accountMoney.pay(item.price));
            inventorySlots[Arrays.asList(inventorySlots).indexOf(item)] = itemToBuy;
        });
    }

}
