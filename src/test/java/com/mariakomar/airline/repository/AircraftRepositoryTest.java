package com.mariakomar.airline.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import com.mariakomar.airline.model.Aircraft;
import com.mariakomar.airline.testdata.AirlineCompanyTestData;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles(profiles = {"test-repository"})
public class AircraftRepositoryTest extends AbstractRepositoryTest<AircraftRepository> {

    @Test
    @DataSet(value = "/aircraft/aircraft.xml", disableConstraints = true)
    public void whenFindByAirlineCompanyName_AircraftsOfThisCompanyFound() {
        List<Aircraft> result = repository.findByAirlineCompany_Name(AirlineCompanyTestData.AIRLINE_COMPANY_NAME);

        assertThat(result.size()).isEqualTo(1);
    }

}
