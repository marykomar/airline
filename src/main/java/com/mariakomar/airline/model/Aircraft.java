package com.mariakomar.airline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "aircraft")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public abstract class Aircraft {

    private static final int AVERAGE_PERSON_WEIGHT = 90;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_sequence")
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", initialValue = 50)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "fuel_consumption")
    private int fuelConsumption;

    @Column(name = "fuel_capacity")
    private int fuelCapacity;

    @Column(name = "empty_weight")
    private int emptyWeight;

    @Column(name = "number_of_pilots")
    private int numberOfPilots;

    @Column(name = "flight_range")
    private int flightRange;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airline_company_id")
    private AirlineCompany airlineCompany;

    public int calculateTotalCapacity() {
        return calculateCarryingCapacity() + calculateCrewWeight() + getEmptyWeight() + getFuelCapacity();
    }

    public abstract int calculateCarryingCapacity();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(int emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public void setNumberOfPilots(int numberOfPilots) {
        this.numberOfPilots = numberOfPilots;
    }

    public AirlineCompany getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(AirlineCompany airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    protected abstract int calculateCrewWeight();

    protected int calculatePersonsWeight(int numberOfPersons) {
        return numberOfPersons * AVERAGE_PERSON_WEIGHT;
    }

}
