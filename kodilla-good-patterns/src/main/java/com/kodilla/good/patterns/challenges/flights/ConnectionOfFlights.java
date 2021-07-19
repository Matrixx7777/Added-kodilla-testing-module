package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class ConnectionOfFlights {

    private ListAllFlights listConnectionOfFlights = new ListAllFlights();

    public void flightsFromTown(String fromTown){
        System.out.println("All flights from " + fromTown + ":");

        listConnectionOfFlights.getFlightsList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(fromTown))
                .forEach(e -> System.out.println("From " + fromTown + " to " + e.getArrivalAirport()));
    }

    public void flightsToTown(String toTown){
        System.out.println("\n" + "All flights to " + toTown + ":");

        listConnectionOfFlights.getFlightsList().stream()
                .filter(flight -> flight.getArrivalAirport().equals(toTown))
                .forEach(e -> System.out.println(e.getDepartureAirport() + " to " + toTown));
    }

    public void flightsThroughTowns(String fromTown, String toTown){
        System.out.println("\n" + "All flights from " + fromTown + " to " + toTown);

        List <Flight>flightsThroughTowns = new ArrayList();

        listConnectionOfFlights.getFlightsList().stream()
                .filter(flight -> flight.getArrivalAirport().equals(toTown))
                .forEach(e -> System.out.println(flightsThroughTowns.add(e)));

        listConnectionOfFlights.getFlightsList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(fromTown))
                .forEach(e -> System.out.println(flightsThroughTowns.add(e)));

        listConnectionOfFlights.getFlightsList().stream()
                .filter(flight -> !flight.getDepartureAirport().equals(fromTown))
                .forEach(e -> System.out.println(fromTown + " --> " +
                        e.getDepartureAirport() + " --> " + toTown));
    }
}
