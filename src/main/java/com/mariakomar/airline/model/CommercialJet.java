package com.mariakomar.airline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "commercial_jet")
public class CommercialJet extends PassengerAircraft {

    @Column(name = "maximum_baggage_weight_per_person")
    private int maximumBaggageWeightPerPerson;

    public int getMaximumBaggageWeightPerPerson() {
        return maximumBaggageWeightPerPerson;
    }

    public void setMaximumBaggageWeightPerPerson(int maximumBaggageWeightPerPerson) {
        this.maximumBaggageWeightPerPerson = maximumBaggageWeightPerPerson;
    }

    @Override
    protected int calculateBaggageWeight() {
        return getMaximumBaggageWeightPerPerson() * getMaximumNumberOfPassengers();
    }
}
