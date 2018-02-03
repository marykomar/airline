package com.mariakomar.airline.testdata;

import com.mariakomar.airline.model.CargoAircraft;
import com.mariakomar.airline.model.CommercialJet;
import com.mariakomar.airline.model.PrivateJet;

public class AircraftTestData {

    public static CargoAircraft validCargoAircraft() {
        CargoAircraft cargoAircraft = new CargoAircraft();
        cargoAircraft.setId(1L);
        cargoAircraft.setName("Cargo");
        cargoAircraft.setAirlineCompany(AirlineCompanyTestData.validAirlineCompany());
        cargoAircraft.setFuelConsumption(200);
        cargoAircraft.setFuelCapacity(20);
        cargoAircraft.setEmptyWeight(34);
        cargoAircraft.setNumberOfPilots(2);
        cargoAircraft.setFlightRange(278);
        cargoAircraft.setMaximumCargoWeight(123);
        return cargoAircraft;
    }

    public static PrivateJet validPrivateJet() {
        PrivateJet privateJet = new PrivateJet();
        privateJet.setId(1L);
        privateJet.setName("Private");
        privateJet.setAirlineCompany(AirlineCompanyTestData.validAirlineCompany());
        privateJet.setFuelConsumption(200);
        privateJet.setFuelCapacity(20);
        privateJet.setEmptyWeight(34);
        privateJet.setNumberOfPilots(2);
        privateJet.setFlightRange(278);
        privateJet.setMaximumNumberOfPassengers(27);
        privateJet.setNumberOfFlightAttendants(2);
        privateJet.setMaximumBaggageWeight(57);
        return privateJet;
    }

    public static CommercialJet validCommercialJet() {
        CommercialJet commercialJet = new CommercialJet();
        commercialJet.setId(1L);
        commercialJet.setName("Commercial");
        commercialJet.setAirlineCompany(AirlineCompanyTestData.validAirlineCompany());
        commercialJet.setFuelConsumption(300);
        commercialJet.setFuelCapacity(40);
        commercialJet.setEmptyWeight(674);
        commercialJet.setNumberOfPilots(3);
        commercialJet.setFlightRange(268);
        commercialJet.setMaximumNumberOfPassengers(256);
        commercialJet.setNumberOfFlightAttendants(3);
        commercialJet.setMaximumBaggageWeightPerPerson(12);
        return commercialJet;
    }
}
