package models.items;

public class Money {

    private int copperCoin = 0;
    private int silverCoin = 0;
    private int goldCoin = 0;
    private int platinumCoin = 0;

    public Money() {
    }

    public Money(int copperMoney, int silverMoney, int goldMoney, int platinumMoney) {
        this.copperCoin = copperMoney;
        this.silverCoin = silverMoney;
        this.goldCoin = goldMoney;
        this.platinumCoin = platinumMoney;
    }

    public Money pay(Money price) {

        int newCopper = this.copperCoin - price.copperCoin;
        int newSilver = this.silverCoin - price.silverCoin;
        int newGold = this.goldCoin - price.goldCoin;
        int newPlatinum = this.platinumCoin - price.platinumCoin;

        return new Money(newCopper, newSilver, newGold, newPlatinum);
    }

    public void add(Money price) {

        this.copperCoin += price.copperCoin;
        this.silverCoin += price.silverCoin;
        this.goldCoin += price.goldCoin;
        this.platinumCoin += price.platinumCoin;
    }

    private void changeCopperToSilver() {
        if (this.copperCoin >= 10) {

            this.copperCoin -= 10;
            this.silverCoin += 1;
        }
    }

    private void changeSilverToGold() {
        if (this.silverCoin >= 100) {

            this.silverCoin -= 100;
            this.goldCoin += 1;
        }
    }

    private void changeGoldToPlatinum() {
        if (this.goldCoin >= 1000) {

            this.goldCoin -= 1000;
            this.platinumCoin += 1;
        }
    }

    public void changeSilverToCopper() {
        if (this.silverCoin >= 1) {

            this.silverCoin -= 1;
            this.copperCoin += 10;
        }
    }

    public void changeGoldToSilver() {
        if (this.goldCoin >= 1) {

            this.goldCoin -= 1;
            this.silverCoin += 100;
        }
    }

    public void changePlatinumToGold() {
        if (this.platinumCoin >= 1) {

            this.platinumCoin -= 1;
            this.goldCoin += 1000;
        }
    }

    public void adjustMoney() {

        this.changeCopperToSilver();
        this.changeSilverToGold();
        this.changeGoldToPlatinum();

    }

    // TODO: increase methods
    public Money increase(double value) {

        
        return null;
    }

    // TODO:decrease method
    public Money decrease(double value) {

        return null;
    }
}
