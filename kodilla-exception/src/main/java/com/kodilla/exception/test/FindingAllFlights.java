package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindingAllFlights {

    public static void main(String[] args){

        Flight flight = new Flight("Moscow","Tokyo");

        try{
            FindingAllFlights b1 = new FindingAllFlights();
            b1.findFlight(flight);
        }
        catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("We welcome to again");
        }
    }

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> mapFlights = new HashMap<>();
        mapFlights.put("Berlin", true);
        mapFlights.put("Rome", true);
        mapFlights.put("Moscow", false);
        mapFlights.put("Paris", true);
        mapFlights.put("Wuhan", false);
        mapFlights.put("London", false);
        mapFlights.put("Madrit", true);
        mapFlights.put("Bangkok", false);
        mapFlights.put("Washington", true);
        mapFlights.put("Tokyo", true);
        mapFlights.put("Maroco", false);

        for(Map.Entry<String,Boolean> map: mapFlights.entrySet()) {
            if (map.getKey().equals(flight.getDepartureAirport())){
                if(map.getValue()){
                    System.out.println("Flight is available with " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
                }
                else{
                    throw new RouteNotFoundException("Flight is unavailable with " + flight.getDepartureAirport());
                }
            }
        }
    }
}
