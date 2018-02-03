package com.mariakomar.airline.testdata;

import com.mariakomar.airline.model.AirlineCompany;

public class AirlineCompanyTestData {

    public static final String AIRLINE_COMPANY_NAME = "Company";

    public static AirlineCompany validAirlineCompany() {
        AirlineCompany airlineCompany = new AirlineCompany();
        airlineCompany.setName(AIRLINE_COMPANY_NAME);
        return airlineCompany;
    }
}
