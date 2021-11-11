package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTestSuite {
    @Test
    void testDefaultInvestingStrategies() {
        //Given
        Customer steven = new IndividualCustomer("Steven Logan");
        Customer john = new IndividualYoungCustomer("John Rambo");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String steveShouldBuy = steven.predict();
        System.out.println("Steven should: " + steveShouldBuy);

        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);

        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);


        //Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", steveShouldBuy);
        assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);

    }

    @Test
    void testIndividualTestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingPredictor(new AggressivePredictor());
        System.out.println("    ///////CHANGE IN PROGRESS////////");
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);

        //Then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);


    }
}
