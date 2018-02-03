package com.mariakomar.airline.repository;

import com.mariakomar.airline.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
    List<Aircraft> findByAirlineCompany_Name(String airlineName);

    List<Aircraft> findByFuelConsumptionIsBetween(int fuelConsumptionMin, int fuelConsumptionMax);

    List<Aircraft> findByAirlineCompany_NameOrderByFlightRange(String airlineName);
}
