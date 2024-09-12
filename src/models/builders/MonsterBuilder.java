package models.builders;

import models.entities.npcs.monsters.Monster;
import models.entities.roles.Rol;
import models.enums.Orientation;
import models.entities.DropTable;

public class MonsterBuilder {

    private Monster monsterToBuild = null;

    public void resetBuild() {
        monsterToBuild = null;
    }

    public void setMonsterBase(Monster base) {
        this.monsterToBuild = base;
    }

    public Monster build() {

        monsterToBuild.setOrientation(Orientation.EVIL);
        Monster resMonster = monsterToBuild;
        resetBuild();

        return resMonster;
    }

    public void setDropTable(DropTable dropTable) {
        monsterToBuild.setDropTable(dropTable);
    }

    public void setName(String name) {
        monsterToBuild.setName(name);
    }

    public void setBasicStats(double maxlife, double lifeRecovery, double maxMana, double manaRecovery) {

        monsterToBuild.setMaxLife(maxlife);
        monsterToBuild.setLifeRecovery(lifeRecovery);
        monsterToBuild.setMaxMana(maxMana);
        monsterToBuild.setManaRecovery(manaRecovery);
    }

    public void setDefenses(int defense, int lightningResistance, int fireResistance, int coldResistance,
            int corruptionResistance) {

        monsterToBuild.setDefense(defense);
        monsterToBuild.setLightningResistance(lightningResistance);
        monsterToBuild.setFireResistance(fireResistance);
        monsterToBuild.setColdResistance(coldResistance);
        monsterToBuild.setCorruptionResistance(corruptionResistance);
    }

    public void isBoss() {
        monsterToBuild.setIsBoss(true);
    }

    public void setRol(Rol rol) {
        monsterToBuild.setRol(rol);
    }

}
