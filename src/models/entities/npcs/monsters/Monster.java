package models.entities.npcs.monsters;

import models.entities.DropTable;
import models.entities.FightableEntitie;

public abstract class Monster extends FightableEntitie {

    private DropTable dropTable = new DropTable();
    private boolean isBoss = false;

    public DropTable getDropTable() {
        return dropTable;
    }

    public void setDropTable(DropTable dropTable) {
        this.dropTable = dropTable;
    }

    public void setIsBoss(boolean isBoss) {
        this.isBoss = isBoss;
    }

    public boolean getIsBoss() {
        return isBoss;
    }

}
