package com.mariakomar.airline.command;

import com.mariakomar.airline.model.Aircraft;
import com.mariakomar.airline.service.AircraftService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.stream.Collectors;

/**
 * Used for for shell interactions with aircraft.
 */
@ShellComponent
public class AircraftCommands {

    private final AircraftService aircraftService;

    public AircraftCommands(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    /**
     * Calculate the total capacity and carrying capacity of all the aircraft in the airline.
     *
     * @param airlineName name of airline
     * @param total       to show total capacity
     * @param carrying    to show carrying capacity
     * @return
     */
    @ShellMethod(value = "Calculate the total capacity and carrying capacity of all the aircraft in the airline.",
            prefix = "-")
    public String capacity(@ShellOption(help = "Airline name") String airlineName,
                           @ShellOption(help = "total capacity") boolean total,
                           @ShellOption(help = "carrying capacity") boolean carrying) {
        String result = "";

        if (total) {
            result = ("total capacity: " + aircraftService.calculateAircraftTotalCapacityByAirline(airlineName));
        }

        if (carrying) {
            result += ("\ncarrying capacity: "
                    + aircraftService.calculateAircraftCarryingCapacityByAirline(airlineName));
        }

        return result;
    }

    @ShellMethod(value = "Display the list of aircraft of the company sorted by flight range.")
    public String sortByFlightRange(@ShellOption(help = "Airline name") String airlineName) {
        return aircraftService.findAircraftsSortedByFlightRangeByAirline(airlineName)
                .stream()
                .map(Aircraft::toString)
                .collect(Collectors.joining("\n"));
    }

    @ShellMethod(value = "Find airplanes corresponding to a given range of fuel consumption parameters.")
    public String findByFuelConsumption(@ShellOption(help = "Minimum fuel consumption") int min,
                                        @ShellOption(help = "Maximum fuel consumption") int max) {
        return aircraftService.findAircraftsByFuelConsumptionRange(min, max)
                .stream()
                .map(Aircraft::toString)
                .collect(Collectors.joining("\n"));
    }

    @ShellMethod(value = "Create cargo aircraft.")
    public String createCargoAircraft(@ShellOption(help = "Airline name") String airlineName,
                                      @ShellOption(help = "Airline name") String aircraftName,
                                      @ShellOption(help = "Airline name") int fuelConsumption,
                                      @ShellOption(help = "Airline name") int fuelCapacity,
                                      @ShellOption(help = "Airline name") int emptyWeight,
                                      @ShellOption(help = "Airline name") int numberOfPilots,
                                      @ShellOption(help = "Airline name") int flightRange,
                                      @ShellOption(help = "Airline name") int maximumCargoWeight) {

        return "Aircraft successfully created\n" + aircraftService.createCargoAircraft(airlineName, aircraftName,
                fuelConsumption, fuelCapacity, emptyWeight, numberOfPilots, flightRange, maximumCargoWeight);
    }

    @ShellMethod(value = "Create private jet.")
    public String createPrivateJet(@ShellOption(help = "Airline name") String airlineName,
                                   @ShellOption(help = "Airline name") String aircraftName,
                                   @ShellOption(help = "Airline name") int fuelConsumption,
                                   @ShellOption(help = "Airline name") int fuelCapacity,
                                   @ShellOption(help = "Airline name") int emptyWeight,
                                   @ShellOption(help = "Airline name") int numberOfPilots,
                                   @ShellOption(help = "Airline name") int flightRange,
                                   @ShellOption(help = "Airline name") int maximumNumberOfPassengers,
                                   @ShellOption(help = "Airline name") int numberOfFlightAttendants,
                                   @ShellOption(help = "Airline name") int maximumBaggageWeight
    ) {
        return "Aircraft successfully created\n" + aircraftService.createPrivateJet(airlineName, aircraftName,
                fuelConsumption, fuelCapacity, emptyWeight, numberOfPilots, flightRange, maximumNumberOfPassengers,
                numberOfFlightAttendants, maximumBaggageWeight);
    }

    @ShellMethod(value = "Create commercial jet.")
    public String createCommercialJet(@ShellOption(help = "Airline name") String airlineName,
                                      @ShellOption(help = "Airline name") String aircraftName,
                                      @ShellOption(help = "Airline name") int fuelConsumption,
                                      @ShellOption(help = "Airline name") int fuelCapacity,
                                      @ShellOption(help = "Airline name") int emptyWeight,
                                      @ShellOption(help = "Airline name") int numberOfPilots,
                                      @ShellOption(help = "Airline name") int flightRange,
                                      @ShellOption(help = "Airline name") int maximumNumberOfPassengers,
                                      @ShellOption(help = "Airline name") int numberOfFlightAttendants,
                                      @ShellOption(help = "Airline name") int maximumBaggageWeightPerPerson) {
        return "Aircraft successfully created\n" + aircraftService.createCommercialJet(airlineName, aircraftName,
                fuelConsumption, fuelCapacity, emptyWeight, numberOfPilots, flightRange, maximumNumberOfPassengers,
                numberOfFlightAttendants, maximumBaggageWeightPerPerson);
    }

}
