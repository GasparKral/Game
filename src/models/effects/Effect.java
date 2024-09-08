package models.effects;

import models.enums.EffectType;

public abstract class Effect {

    private EffectType type;
    private Integer duration;
    private Integer acumulation;
    private boolean permanent = false;
    private boolean stackable = false;

}
