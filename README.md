# Airline
Console application “Airline”

## Features
* Create airline company.
* Create aircraft.
* Calculate the total capacity and carrying capacity of all the aircraft in the airline.
* Display the list of aircraft of the company sorted by flight range.
* Find airplanes corresponding to a given range of fuel consumption parameters.

## Running

To run the application execute

```
mvn spring-boot:run
```

or

```
mvn package && java -jar airline.jar
```

## Getting started
Use help to get information about available commands.

## Examples
Show all airlines
```
airlines
```

Create airline

```
create-airline "New airline"

```

Calculate the total capacity and carrying capacity of all the aircraft in the airline
```
capacity "New airline" -total -carrying

```

Find airplanes corresponding to a given range of fuel consumption parameters

```
find-by-fuel-consumption 0 10000
```

Display the list of aircraft of the company sorted by flight range
```
sort-by-flight-range "New company"

```
Create cargo aircraft
```
create-cargo-aircraft "African airline" "cargo" 1230 230 3440 2 670 45
```
 
