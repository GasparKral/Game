package models.items.weapons;

import models.enums.WeaponType;
import models.enums.WeaponWeight;
import models.items.Item;

public class Weapon extends Item {

    private WeaponType type;
    private WeaponWeight weight;
    private Integer damage;
    private Double accuracy;
    private Double criticalChance;
    private Double criticalDamage;

    public WeaponType getType() {
        return this.type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public Weapon type(WeaponType type) {
        setType(type);
        return this;
    }

    public WeaponWeight getWeight() {
        return this.weight;
    }

    public void setWeight(WeaponWeight weight) {
        this.weight = weight;
    }

    public Weapon weight(WeaponWeight weight) {
        setWeight(weight);
        return this;
    }

    public Integer getDamage() {
        return this.damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Weapon damage(Integer damage) {
        setDamage(damage);
        return this;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Weapon accuracy(Double accuracy) {
        setAccuracy(accuracy);
        return this;
    }

    public Double getCriticalChance() {
        return this.criticalChance;
    }

    public void setCriticalChance(Double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public Weapon criticalChance(Double criticalChance) {
        setCriticalChance(criticalChance);
        return this;
    }

    public Double getCriticalDamage() {
        return this.criticalDamage;
    }

    public void setCriticalDamage(Double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public Weapon criticalDamage(Double criticalDamage) {
        setCriticalDamage(criticalDamage);
        return this;
    }

}
