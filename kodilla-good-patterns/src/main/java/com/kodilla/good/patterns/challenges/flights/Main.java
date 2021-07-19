package com.kodilla.good.patterns.challenges.flights;

public class Main {

    public static void main(String[] args) {
        ConnectionOfFlights connection = new ConnectionOfFlights();
        connection.flightsFromTown("Warsaw");
        connection.flightsToTown("Berlin");
        connection.flightsThroughTowns("Moscow","Paris");
    }
}
