package models.builders;

import models.entities.npcs.monsters.Monster;
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

}
