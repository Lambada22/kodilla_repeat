package com.kodilla.good.patterns.example;

import java.time.LocalDateTime;

public interface RentalRepository {

    public boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
