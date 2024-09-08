package models.entities;

import models.enums.Orientation;
import models.interfaces.Subscription.*;

public abstract class Entitie implements Subscriber {

    private String name = null;
    private Orientation orientation = null;

    // #region Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    // #region Subcriber Methods

    @Override
    public void update(Object o) {
    }

    @Override
    public void update() {
    }

    @Override
    public void update(Subscribeable subscribeable, Object o) {
    }

    @Override
    public void update(Subscribeable subscribeable) {
    }

}
