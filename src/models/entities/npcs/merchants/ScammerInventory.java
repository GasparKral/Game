package models.entities.npcs.merchants;

import models.entities.Inventory;
import models.items.Item;
import models.items.Money;

public class ScammerInventory extends Inventory {

    private Inventory targetInventory;

    public ScammerInventory(Inventory targetInventory) {
        this.targetInventory = targetInventory;
    }

    @Override
    public void sellItem(Item itemToSell, Inventory targetInventory) {
        // Modificar el precio de venta para que el estafador gane más dinero
        Money originalPrice = itemToSell.price;
        itemToSell.price = originalPrice.increase((1 + Math.random())); // aumentar el precio un 20%

        targetInventory.sellItem(itemToSell, this);

        // Restaurar el precio original
        itemToSell.price = originalPrice;
    }

    @Override
    public void buyItem(Item itemToBuy, Inventory targetInventory) {
        // Modificar el precio de compra para que el estafador pague menos dinero
        Money originalPrice = itemToBuy.price;
        itemToBuy.price = originalPrice.decrease(1 - Math.random()); // disminuir el precio un 20%

        targetInventory.buyItem(itemToBuy, this);

        // Restaurar el precio original
        itemToBuy.price = originalPrice;
    }

}
