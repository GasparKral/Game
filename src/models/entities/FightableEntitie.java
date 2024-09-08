package models.entities;

import models.effects.Effect;
import models.entities.roles.Rol;

import java.util.HashSet;

public abstract class FightableEntitie extends Entitie {

    private Double actualLife = null;
    private Double maxLife = null;
    private Double lifeRecovery = null;
    private Double actualMana = null;
    private Double maxMana = null;
    private Double manaRecovery = null;
    private Integer defense = null;
    private Integer lightningResistance = null;
    private Integer fireResistance = null;
    private Integer coldResistance = null;
    private Integer corruptionResistance = null;

    private HashSet<Effect> effects = new HashSet<Effect>();
    private Rol rol = null;

    public Double getActualLife() {
        return this.actualLife;
    }

    public void setActualLife(Double actualLife) {
        this.actualLife = actualLife;
    }

    public FightableEntitie actualLife(Double actualLife) {
        setActualLife(actualLife);
        return this;
    }

    public Double getMaxLife() {
        return this.maxLife;
    }

    public void setMaxLife(Double maxLife) {
        this.maxLife = maxLife;
    }

    public FightableEntitie maxLife(Double maxLife) {
        setMaxLife(maxLife);
        return this;
    }

    public Double getLifeRecovery() {
        return this.lifeRecovery;
    }

    public void setLifeRecovery(Double lifeRecovery) {
        this.lifeRecovery = lifeRecovery;
    }

    public FightableEntitie lifeRecovery(Double lifeRecovery) {
        setLifeRecovery(lifeRecovery);
        return this;
    }

    public Double getActualMana() {
        return this.actualMana;
    }

    public void setActualMana(Double actualMana) {
        this.actualMana = actualMana;
    }

    public FightableEntitie actualMana(Double actualMana) {
        setActualMana(actualMana);
        return this;
    }

    public Double getMaxMana() {
        return this.maxMana;
    }

    public void setMaxMana(Double maxMana) {
        this.maxMana = maxMana;
    }

    public FightableEntitie maxMana(Double maxMana) {
        setMaxMana(maxMana);
        return this;
    }

    public Double getManaRecovery() {
        return this.manaRecovery;
    }

    public void setManaRecovery(Double manaRecovery) {
        this.manaRecovery = manaRecovery;
    }

    public FightableEntitie manaRecovery(Double manaRecovery) {
        setManaRecovery(manaRecovery);
        return this;
    }

    public Integer getDefense() {
        return this.defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public FightableEntitie defense(Integer defense) {
        setDefense(defense);
        return this;
    }

    public Integer getLightningResistance() {
        return this.lightningResistance;
    }

    public void setLightningResistance(Integer lightningResistance) {
        this.lightningResistance = lightningResistance;
    }

    public FightableEntitie lightningResistance(Integer lightningResistance) {
        setLightningResistance(lightningResistance);
        return this;
    }

    public Integer getFireResistance() {
        return this.fireResistance;
    }

    public void setFireResistance(Integer fireResistance) {
        this.fireResistance = fireResistance;
    }

    public FightableEntitie fireResistance(Integer fireResistance) {
        setFireResistance(fireResistance);
        return this;
    }

    public Integer getColdResistance() {
        return this.coldResistance;
    }

    public void setColdResistance(Integer coldResistance) {
        this.coldResistance = coldResistance;
    }

    public FightableEntitie coldResistance(Integer coldResistance) {
        setColdResistance(coldResistance);
        return this;
    }

    public Integer getCorruptionResistance() {
        return this.corruptionResistance;
    }

    public void setCorruptionResistance(Integer corruptionResistance) {
        this.corruptionResistance = corruptionResistance;
    }

    public FightableEntitie corruptionResistance(Integer corruptionResistance) {
        setCorruptionResistance(corruptionResistance);
        return this;
    }

    public HashSet<Effect> getEffects() {
        return this.effects;
    }

    public void setEffects(HashSet<Effect> effects) {
        this.effects = effects;
    }

    public FightableEntitie effects(HashSet<Effect> effects) {
        setEffects(effects);
        return this;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public FightableEntitie rol(Rol rol) {
        setRol(rol);
        return this;
    }

}
