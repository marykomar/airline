package com.mariakomar.airline.service;

import com.mariakomar.airline.model.AirlineCompany;
import com.mariakomar.airline.repository.AirlineCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineCompanyServiceDbImpl implements AirlineCompanyService {

    private final AirlineCompanyRepository airlineCompanyRepository;

    public AirlineCompanyServiceDbImpl(AirlineCompanyRepository airlineCompanyRepository) {
        this.airlineCompanyRepository = airlineCompanyRepository;
    }

    @Override
    public List<AirlineCompany> findAll() {
        return airlineCompanyRepository.findAll();
    }

    @Override
    public AirlineCompany create(String airlineCompanyName) {
        AirlineCompany airlineCompany = new AirlineCompany();
        airlineCompany.setName(airlineCompanyName);
        return airlineCompanyRepository.save(airlineCompany);
    }
}
