package models.entities.npcs.monsters;

import models.entities.DropTable;
import models.entities.FightableEntitie;

public abstract class Monster extends FightableEntitie {

    private DropTable dropTable = new DropTable();

    public DropTable getDropTable() {
        return dropTable;
    }

    public void setDropTable(DropTable dropTable) {
        this.dropTable = dropTable;
    }

    

}
