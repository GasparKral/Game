package client;

import models.entities.non_npcs.PCharacter;
import utils.generics.Adress;

import java.util.ArrayList;

public class Player {

    private String name = "";
    private Adress adress;
    private boolean isTeamLeader = false;
    private ArrayList<PCharacter> characters = new ArrayList<PCharacter>();
    private PCharacter currentCharacter = null;
    private ClientConfiguration clientConfiguration = new ClientConfiguration();

}
