package com.kodilla.good.patterns.example;

import java.time.LocalDateTime;

public class CarRentalService {

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getName() + user.getSurName()
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }
}
