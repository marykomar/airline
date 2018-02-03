package com.mariakomar.airline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cargo_aircraft")
public class CargoAircraft extends Aircraft{

    @Column(name = "cargo_weight")
    private int maximumCargoWeight;

    @Override
    public int calculateCarryingCapacity() {
        return maximumCargoWeight;
    }

    public int getMaximumCargoWeight() {
        return maximumCargoWeight;
    }

    public void setMaximumCargoWeight(int maximumCargoWeight) {
        this.maximumCargoWeight = maximumCargoWeight;
    }

    @Override
    protected int calculateCrewWeight() {
        return calculatePersonsWeight(getNumberOfPilots());
    }
}
