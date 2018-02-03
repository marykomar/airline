package com.mariakomar.airline.repository;

import com.mariakomar.airline.model.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineCompanyRepository extends JpaRepository<AirlineCompany, Long> {
    AirlineCompany findByName(String name);
}
