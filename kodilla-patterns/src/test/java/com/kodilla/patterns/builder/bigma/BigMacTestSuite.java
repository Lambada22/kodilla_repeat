package com.kodilla.patterns.builder.bigma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void TestBigMacNew(){
        //Given
        BigMac bigMac=new BigMac.BigMacBuilder()
                .ingredients("Onion")
                .ingredients("Ham")
                .ingredients("Cheese")
                .burgers(3)
                .sauce("1000 Islands")
                .bun(true)
                .roll(false)
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients=bigMac.getIngredients().size();
        //Then
        assertEquals(3,howManyIngredients);

    }
}
