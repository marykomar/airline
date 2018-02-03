package com.mariakomar.airline.service;

import com.mariakomar.airline.model.Aircraft;
import com.mariakomar.airline.model.AirlineCompany;
import com.mariakomar.airline.model.CargoAircraft;
import com.mariakomar.airline.model.CommercialJet;
import com.mariakomar.airline.model.PrivateJet;
import com.mariakomar.airline.repository.AircraftRepository;
import com.mariakomar.airline.repository.AirlineCompanyRepository;
import com.mariakomar.airline.service.exceptions.AirlineNotExistsException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AircraftServiceDbImpl implements AircraftService {

    private final AircraftRepository aircraftRepository;
    private final AirlineCompanyRepository airlineCompanyRepository;

    public AircraftServiceDbImpl(AircraftRepository aircraftRepository, AirlineCompanyRepository
            airlineCompanyRepository) {
        this.aircraftRepository = aircraftRepository;
        this.airlineCompanyRepository = airlineCompanyRepository;
    }

    @Override
    public int calculateAircraftTotalCapacityByAirline(String airlineName) {
        List<Aircraft> aircrafts = aircraftRepository.findByAirlineCompany_Name(airlineName);
        return aircrafts.stream().mapToInt(Aircraft::calculateTotalCapacity).sum();
    }

    @Override
    public int calculateAircraftCarryingCapacityByAirline(String airlineName) {
        List<Aircraft> aircrafts = aircraftRepository.findByAirlineCompany_Name(airlineName);
        return aircrafts.stream().mapToInt(Aircraft::calculateCarryingCapacity).sum();
    }

    @Override
    public List<Aircraft> findAircraftsSortedByFlightRangeByAirline(String airlineName) {
        return aircraftRepository.findByAirlineCompany_NameOrderByFlightRange(airlineName);
    }

    @Override
    public List<Aircraft> findAircraftsByFuelConsumptionRange(int fuelConsumptionMin, int fuelConsumptionMax) {
        return aircraftRepository.findByFuelConsumptionIsBetween(fuelConsumptionMin, fuelConsumptionMax);
    }

    @Override
    @Transactional
    public Aircraft createCargoAircraft(String airlineName, String aircraftName, int fuelConsumption, int fuelCapacity,
                                        int emptyWeight, int numberOfPilots, int flightRange, int maximumCargoWeight) {
        AirlineCompany airlineCompany = findAirlineIfExists(airlineName);
        CargoAircraft cargoAircraft = new CargoAircraft();
        cargoAircraft.setName(aircraftName);
        cargoAircraft.setFuelConsumption(fuelConsumption);
        cargoAircraft.setFuelCapacity(fuelCapacity);
        cargoAircraft.setEmptyWeight(emptyWeight);
        cargoAircraft.setNumberOfPilots(numberOfPilots);
        cargoAircraft.setFlightRange(flightRange);
        cargoAircraft.setMaximumCargoWeight(maximumCargoWeight);
        airlineCompany.addAircraft(cargoAircraft);
        return aircraftRepository.save(cargoAircraft);
    }

    @Override
    @Transactional
    public Aircraft createCommercialJet(String airlineName, String aircraftName, int fuelConsumption, int fuelCapacity,
                                        int emptyWeight, int numberOfPilots, int flightRange,
                                        int maximumNumberOfPassengers, int numberOfFlightAttendants,
                                        int maximumBaggageWeightPerPerson) {
        AirlineCompany airlineCompany = findAirlineIfExists(airlineName);
        CommercialJet commercialJet = new CommercialJet();
        commercialJet.setName(aircraftName);
        commercialJet.setFuelConsumption(fuelConsumption);
        commercialJet.setFuelCapacity(fuelCapacity);
        commercialJet.setEmptyWeight(emptyWeight);
        commercialJet.setNumberOfPilots(numberOfPilots);
        commercialJet.setFlightRange(flightRange);
        commercialJet.setMaximumNumberOfPassengers(maximumNumberOfPassengers);
        commercialJet.setNumberOfFlightAttendants(numberOfFlightAttendants);
        commercialJet.setMaximumBaggageWeightPerPerson(maximumBaggageWeightPerPerson);
        airlineCompany.addAircraft(commercialJet);
        return aircraftRepository.save(commercialJet);
    }

    @Override
    @Transactional
    public Aircraft createPrivateJet(String airlineName, String aircraftName, int fuelConsumption, int fuelCapacity,
                                     int emptyWeight, int numberOfPilots, int flightRange,
                                     int maximumNumberOfPassengers, int numberOfFlightAttendants,
                                     int maximumBaggageWeight) {
        AirlineCompany airlineCompany = findAirlineIfExists(airlineName);
        PrivateJet privateJet = new PrivateJet();
        privateJet.setName(aircraftName);
        privateJet.setFuelConsumption(fuelConsumption);
        privateJet.setFuelCapacity(fuelCapacity);
        privateJet.setEmptyWeight(emptyWeight);
        privateJet.setNumberOfPilots(numberOfPilots);
        privateJet.setFlightRange(flightRange);
        privateJet.setMaximumNumberOfPassengers(maximumNumberOfPassengers);
        privateJet.setNumberOfFlightAttendants(numberOfFlightAttendants);
        privateJet.setMaximumBaggageWeight(maximumBaggageWeight);
        airlineCompany.addAircraft(privateJet);
        return aircraftRepository.save(privateJet);
    }

    private AirlineCompany findAirlineIfExists(String airlineName) {
        AirlineCompany airlineCompany = airlineCompanyRepository.findByName(airlineName);
        if (airlineCompany == null) {
            throw new AirlineNotExistsException("Airline with such name not found");
        }
        return airlineCompany;
    }
}
