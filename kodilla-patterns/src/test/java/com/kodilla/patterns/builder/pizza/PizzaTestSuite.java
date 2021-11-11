package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //Given
//        Pizza pizza= new Pizza("Thin", "Spicy", "Mushrooms","Ham","Cheese");
//        System.out.println(pizza);
//
//        //When
//        int howManyIngredients= pizza.getIngredients().size();
//
//        //Then
//        assertEquals(3,howManyIngredients);

    }

    @Test
    void TestPizzaNew2() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder().ingredients("onion").
                ingredients("Ham").
                bottom("Thin").
                sauce("Spicy").
                build();
        System.out.println(pizza);

        //When
        int howManyIngredients = pizza.getIngredients().size();

        //Then
        assertEquals(2, howManyIngredients);

    }
}
