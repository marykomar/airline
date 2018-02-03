package com.mariakomar.airline.service;

import com.mariakomar.airline.model.Aircraft;

import java.util.List;

public interface AircraftService {
    int calculateAircraftTotalCapacityByAirline(String airlineName);

    int calculateAircraftCarryingCapacityByAirline(String airlineName);

    List<Aircraft> findAircraftsSortedByFlightRangeByAirline(String airlineName);

    List<Aircraft> findAircraftsByFuelConsumptionRange(int fuelConsumptionMin, int fuelConsumptionMax);

    Aircraft createCargoAircraft(String airlineName, String aircraftName, int fuelConsumption, int fuelCapacity,
                                 int emptyWeight, int numberOfPilots, int flightRange, int maximumCargoWeight);

    Aircraft createCommercialJet(String airlineName, String aircraftName, int fuelConsumption, int fuelCapacity,
                                 int emptyWeight, int numberOfPilots, int flightRange,
                                 int maximumNumberOfPassengers, int numberOfFlightAttendants,
                                 int maximumBaggageWeightPerPerson);

    Aircraft createPrivateJet(String airlineName, String aircraftName, int fuelConsumption, int fuelCapacity,
                              int emptyWeight, int numberOfPilots, int flightRange,
                              int maximumNumberOfPassengers, int numberOfFlightAttendants,
                              int maximumBaggageWeight);
}
