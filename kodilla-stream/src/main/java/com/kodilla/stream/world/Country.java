package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    public final String name;
    public final BigDecimal amountOfPeople;

    public Country(String name, BigDecimal amountOfPeople) {
        this.name = name;
        this.amountOfPeople = amountOfPeople;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity(){
        return amountOfPeople;
    }

}
