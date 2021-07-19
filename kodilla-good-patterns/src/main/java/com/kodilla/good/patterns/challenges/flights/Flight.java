package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    private int id = 98712304;


    public Flight(String departureAirport, String arrivalAirport){
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "Departure airport " + departureAirport + "\n" +
               "Arrival airport " + arrivalAirport + "\n" +
                "Id our airport " + id;
    }

    public int hashCode(){
        return Objects.hash(arrivalAirport, departureAirport);
    }

    public boolean equals (Object o){
        if(this == o) return true;
        if(o == null || getClass() != getClass()) return false;

        Flight flight = (Flight) o;
        return  Objects.equals(arrivalAirport,flight.departureAirport) &&
                Objects.equals(arrivalAirport,flight.departureAirport);
    }
}
