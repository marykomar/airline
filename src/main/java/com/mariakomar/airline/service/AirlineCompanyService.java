package com.mariakomar.airline.service;

import com.mariakomar.airline.model.AirlineCompany;

import java.util.List;

public interface AirlineCompanyService {
    List<AirlineCompany> findAll();

    AirlineCompany create(String airlineCompanyName);
}
