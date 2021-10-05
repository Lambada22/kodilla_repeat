package com.kodilla.good.patterns.example;

import java.time.LocalDateTime;

public class RentRequest {

    private User user;
    private LocalDateTime from;
    private LocalDateTime to;

    public RentRequest(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
