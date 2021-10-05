package com.kodilla.exception.test;

public class FlyManager {
    public static void main(String[] args) throws RouteNotFoundException{
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.findFlight(new Flight("KRK", "BRN"));
    }

}
