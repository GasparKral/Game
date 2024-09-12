package models.items.armours;

import models.enums.ArmourSection;
import models.items.Item;

public class Armour extends Item {

    private ArmourSection section;
    private Double defense;
    private Double lightningResistance;
    private Double fireResistance;
    private Double coldResistance;
    private Double corruptionResistance;

    public ArmourSection getSection() {
        return this.section;
    }

    public void setSection(ArmourSection section) {
        this.section = section;
    }

    public Armour section(ArmourSection section) {
        setSection(section);
        return this;
    }

    public Double getDefense() {
        return this.defense;
    }

    public void setDefense(Double defense) {
        this.defense = defense;
    }

    public Armour defense(Double defense) {
        setDefense(defense);
        return this;
    }

    public Double getLightningResistance() {
        return this.lightningResistance;
    }

    public void setLightningResistance(Double lightningResistance) {
        this.lightningResistance = lightningResistance;
    }

    public Armour lightningResistance(Double lightningResistance) {
        setLightningResistance(lightningResistance);
        return this;
    }

    public Double getFireResistance() {
        return this.fireResistance;
    }

    public void setFireResistance(Double fireResistance) {
        this.fireResistance = fireResistance;
    }

    public Armour fireResistance(Double fireResistance) {
        setFireResistance(fireResistance);
        return this;
    }

    public Double getColdResistance() {
        return this.coldResistance;
    }

    public void setColdResistance(Double coldResistance) {
        this.coldResistance = coldResistance;
    }

    public Armour coldResistance(Double coldResistance) {
        setColdResistance(coldResistance);
        return this;
    }

    public Double getCorruptionResistance() {
        return this.corruptionResistance;
    }

    public void setCorruptionResistance(Double corruptionResistance) {
        this.corruptionResistance = corruptionResistance;
    }

    public Armour corruptionResistance(Double corruptionResistance) {
        setCorruptionResistance(corruptionResistance);
        return this;
    }

}
