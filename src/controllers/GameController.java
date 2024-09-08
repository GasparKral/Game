package controllers;

import models.enums.Biome;
import models.entities.Entitie;
import models.interfaces.Subscription.*;

import java.util.ArrayList;
import java.util.List;

public class GameController implements Subscribeable {

    private Biome actualBiome;
    private ArrayList<Entitie> listOfInvolvedsEntities = new ArrayList<Entitie>();

    public GameController() {

    }

    public GameController(Entitie[] entities) {

        this.listOfInvolvedsEntities = new ArrayList<Entitie>(List.of(entities));
    }

}
