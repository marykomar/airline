package com.mariakomar.airline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "private_jet")
public class PrivateJet extends PassengerAircraft {

    @Column(name = "maximum_baggage_weight")
    private int maximumBaggageWeight;

    public int getMaximumBaggageWeight() {
        return maximumBaggageWeight;
    }

    public void setMaximumBaggageWeight(int maximumBaggageWeight) {
        this.maximumBaggageWeight = maximumBaggageWeight;
    }

    @Override
    protected int calculateBaggageWeight() {
        return maximumBaggageWeight;
    }

    @Override
    public String toString() {
        return "PrivateJet{" +
                "maximumBaggageWeight=" + maximumBaggageWeight +
                super.toString() +
                '}';
    }
}
