package data;

import models.enums.Biome;
import models.entities.npcs.monsters.Monster;

import java.util.ArrayList;

public class AdventureSt {

    private ArrayList<Biome> crossedBiomes = new ArrayList<Biome>();
    private ArrayList<Monster> bossesDefeated = new ArrayList<Monster>();
    private ArrayList<Monster> monstersDefeated = new ArrayList<Monster>();

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
