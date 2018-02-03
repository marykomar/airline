package com.mariakomar.airline.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airline_company")
public class AirlineCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airline_sequence")
    @SequenceGenerator(name = "airline_sequence", sequenceName = "airline_sequence", initialValue = 50)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(
            mappedBy = "airlineCompany",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Aircraft> aircrafts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
        aircraft.setAirlineCompany(this);
    }

    public void removeAircraft(Aircraft aircraft) {
        aircrafts.remove(aircraft);
        aircraft.setAirlineCompany(null);
    }

}
