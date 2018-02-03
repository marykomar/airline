CREATE SEQUENCE aircraft_sequence
  START WITH 50
  INCREMENT BY 50;
CREATE SEQUENCE airline_sequence
  START WITH 50
  INCREMENT BY 50;
CREATE TABLE airline_company (
  id   BIGINT NOT NULL,
  name VARCHAR(255),
  PRIMARY KEY (id)
);
CREATE TABLE aircraft (
  id                 BIGINT NOT NULL,
  name               VARCHAR(255),
  empty_weight       INTEGER,
  fuel_capacity      INTEGER,
  fuel_consumption   INTEGER,
  number_of_pilots   INTEGER,
  flight_range       INTEGER,
  airline_company_id BIGINT,
  PRIMARY KEY (id)
);
CREATE TABLE cargo_aircraft (
  cargo_weight INTEGER,
  id           BIGINT NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE passenger_aircraft (
  number_of_passengers        INTEGER,
  number_of_flight_attendants INTEGER,
  id                          BIGINT NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE commercial_jet (
  maximum_baggage_weight_per_person INTEGER,
  id                                BIGINT NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE private_jet (
  maximum_baggage_weight INTEGER,
  id                     BIGINT NOT NULL,
  PRIMARY KEY (id)
);
ALTER TABLE aircraft
  ADD CONSTRAINT FK_aircraft_airline_company FOREIGN KEY (airline_company_id) REFERENCES airline_company;
ALTER TABLE cargo_aircraft
  ADD CONSTRAINT FK_cargo_aircraft_aircraft FOREIGN KEY (id) REFERENCES aircraft;
ALTER TABLE commercial_jet
  ADD CONSTRAINT FK_commercial_jet_passenger_aircraft FOREIGN KEY (id) REFERENCES passenger_aircraft;
ALTER TABLE passenger_aircraft
  ADD CONSTRAINT FK_passenger_aircraft_aircraft FOREIGN KEY (id) REFERENCES aircraft;
ALTER TABLE private_jet
  ADD CONSTRAINT FK_private_jet_passenger_aircraft FOREIGN KEY (id) REFERENCES passenger_aircraft;
