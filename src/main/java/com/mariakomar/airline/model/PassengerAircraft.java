package com.mariakomar.airline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_aircraft")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public abstract class PassengerAircraft extends Aircraft {

    @Column(name = "number_of_passengers")
    private int maximumNumberOfPassengers;

    @Column(name = "number_of_flight_attendants")
    private int numberOfFlightAttendants;

    @Override
    public int calculateCarryingCapacity() {
        return calculatePersonsWeight(getMaximumNumberOfPassengers()) + calculateBaggageWeight();
    }

    public int getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers) {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    public int getNumberOfFlightAttendants() {
        return numberOfFlightAttendants;
    }

    public void setNumberOfFlightAttendants(int numberOfFlightAttendants) {
        this.numberOfFlightAttendants = numberOfFlightAttendants;
    }

    @Override
    protected int calculateCrewWeight() {
        return calculatePersonsWeight(getNumberOfPilots() + getNumberOfFlightAttendants());
    }

    protected abstract int calculateBaggageWeight();
}
