package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> ourFlight = new HashMap<>();
        ourFlight.put("KRK", false);
        ourFlight.put("BRC", true);
        ourFlight.put("NYC", true);

        if (!ourFlight.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
    }
}
