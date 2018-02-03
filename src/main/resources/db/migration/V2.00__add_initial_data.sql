INSERT INTO public.airline_company (name, id) VALUES ('African airline', 1);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range,
                      id)
VALUES (1, 'Antonov An-225 Mriya', 285000, 37361898, 16000, 3, 400000 , 1);
INSERT INTO cargo_aircraft (cargo_weight, id) VALUES (25000000, 1);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Boeing 747 Dreamlifter', 270000, 37161898, 15000, 4, 300000, 2);
INSERT INTO cargo_aircraft (cargo_weight, id) VALUES (23000000, 2);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Aero Spacelines Super Guppy', 250000, 37261898, 17000, 3, 310000, 3);
INSERT INTO cargo_aircraft (cargo_weight, id) VALUES (22000000, 3);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Cessna Citation Mustang', 36800000, 20449866, 9000, 3, 420000, 4);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (10, 3, 4);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (1000000, 4);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Embraer Phenom 100', 36700000, 20049866, 9100, 2, 403000, 5);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (9, 1, 5);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 5);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Beechcraft Super King Air', 36850000, 20446866, 9200, 2, 320000, 6);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (7, 1, 6);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 6);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Bombardier Learjet 45', 33800000, 20449846, 9040, 3, 350000, 7);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (8, 1, 7);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 7);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Airbus A320 family', 53800000, 2386000, 17000, 4, 390000, 8);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (189, 4, 8);
INSERT INTO commercial_jet (maximum_baggage_weight_per_person, id) VALUES (500, 8);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (1, 'Boeing 737 NG', 52800000, 2376000, 18000, 3, 410300, 9);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (201, 5, 9);
INSERT INTO commercial_jet (maximum_baggage_weight_per_person, id) VALUES (510, 9);


INSERT INTO public.airline_company (name, id) VALUES ('Australian airline', 2);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Antonov An-124 Condor', 275000, 32361898, 14000, 3, 405000, 10);
INSERT INTO cargo_aircraft (cargo_weight, id) VALUES (22000000, 10);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Lockheed C-5 Galaxy', 235000, 37261898, 18000, 4, 430000, 11);
INSERT INTO cargo_aircraft (cargo_weight, id) VALUES (21000000, 11);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Bombardier Challenger 850', 36700000, 37360898, 9030, 2, 350000, 12);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (10, 2, 12);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 12);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Bombardier Challenger 350', 34700000, 36360898, 9140, 2, 402000, 13);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (3, 1, 13);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 13);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Piaggio Avanti', 32700000, 36260898, 9020, 2, 403000, 18);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (7, 3, 18);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 18);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Embraer Phenom 300', 34400000, 36320898, 9230, 2, 405000, 14);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (8, 2, 14);
INSERT INTO private_jet (maximum_baggage_weight, id) VALUES (500, 14);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Boeing 777', 52800000, 2376000, 18000, 3, 330000, 15);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (189, 4, 15);
INSERT INTO commercial_jet (maximum_baggage_weight_per_person, id) VALUES (499, 15);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Airbus A330', 52300000, 2326000, 17000, 4, 411000, 16);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (187, 5, 16);
INSERT INTO commercial_jet (maximum_baggage_weight_per_person, id) VALUES (520, 16);

INSERT INTO aircraft (airline_company_id, name, empty_weight, fuel_capacity, fuel_consumption, number_of_pilots, flight_range, id)
VALUES (2, 'Boeing 767', 52800400, 2476000, 19000, 4, 400330, 17);
INSERT INTO passenger_aircraft (number_of_passengers, number_of_flight_attendants, id) VALUES (203, 4, 17);
INSERT INTO commercial_jet (maximum_baggage_weight_per_person, id) VALUES (510, 17);


