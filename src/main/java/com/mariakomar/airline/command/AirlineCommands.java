package com.mariakomar.airline.command;

import com.mariakomar.airline.model.AirlineCompany;
import com.mariakomar.airline.service.AirlineCompanyService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.stream.Collectors;

/**
 * Used for shell interactions with airlines.
 */
@ShellComponent
public class AirlineCommands {

    private final AirlineCompanyService airlineCompanyService;

    public AirlineCommands(AirlineCompanyService airlineCompanyService) {
        this.airlineCompanyService = airlineCompanyService;
    }

    /**
     * Show all airlines.
     *
     * @return string representation of airlines.
     */
    @ShellMethod(value = "Show all airlines.")
    public String airlines() {
        return airlineCompanyService.findAll()
                .stream()
                .map(AirlineCompany::toString)
                .collect(Collectors.joining("\n"));
    }

    /**
     * Create airline by its name.
     *
     * @param airlineName the name of airline.
     * @return
     */
    @ShellMethod(value = "Create airline.")
    public String createAirline(@ShellOption(help = "Airline name") String airlineName) {
        return "Airline company successfully created.\n" + airlineCompanyService.create(airlineName);
    }
}
