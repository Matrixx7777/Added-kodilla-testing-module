package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class ListAllFlights {

    public List<Flight> getFlightsList() {

        List<Flight> listAllFlights = new ArrayList<>();
        listAllFlights.add(new Flight("Warsaw", "Berlin"));
        listAllFlights.add(new Flight("Madrit", "London"));
        listAllFlights.add(new Flight("Berlin", "Paris"));
        listAllFlights.add(new Flight("Berlin", "London"));
        listAllFlights.add(new Flight("Moscow", "Warsaw"));
        listAllFlights.add(new Flight("Paris", "Berlin"));
        listAllFlights.add(new Flight("New York", "Warsaw"));
        listAllFlights.add(new Flight("London", "Warsaw"));
        listAllFlights.add(new Flight("Tokyo", "Roma"));
        listAllFlights.add(new Flight("Roma", "Warsaw"));

        return  listAllFlights;
    }
}
