package com.mariakomar.airline.service;

import com.mariakomar.airline.model.Aircraft;
import com.mariakomar.airline.repository.AircraftRepository;
import com.mariakomar.airline.repository.AirlineCompanyRepository;
import com.mariakomar.airline.testdata.AircraftTestData;
import com.mariakomar.airline.testdata.AirlineCompanyTestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AircraftServiceDbImplTest {

    @InjectMocks
    private AircraftServiceDbImpl aircraftServiceDb;

    @Mock
    private AircraftRepository aircraftRepository;

    @Mock
    private AirlineCompanyRepository airlineCompanyRepository;

    @Test
    public void whenCalculateAircraftCarryingCapacityByAirline_CorrectCarryingCapacityReturned() {
        List<Aircraft> aircrafts = Arrays.asList(AircraftTestData.validCargoAircraft(),
                AircraftTestData.validCommercialJet(), AircraftTestData.validPrivateJet());
        int expectedCarryingCapacity = 28722;

        when(aircraftRepository.findByAirlineCompany_Name(AirlineCompanyTestData.AIRLINE_COMPANY_NAME))
                .thenReturn(aircrafts);

        int actualCarryingCapacity = aircraftServiceDb.calculateAircraftCarryingCapacityByAirline(AirlineCompanyTestData
                .AIRLINE_COMPANY_NAME);

        verify(aircraftRepository).findByAirlineCompany_Name(AirlineCompanyTestData.AIRLINE_COMPANY_NAME);
        verifyNoMoreInteractions(aircraftRepository);

        assertThat(expectedCarryingCapacity).isEqualTo(actualCarryingCapacity);
    }

}