package com.mariakomar.airline.service.exceptions;

public class AirlineNotExistsException extends RuntimeException {
    public AirlineNotExistsException(String message) {
        super(message);
    }
}
