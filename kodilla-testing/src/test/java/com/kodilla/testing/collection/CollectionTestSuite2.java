package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite2 {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite:begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }


    @DisplayName("When created Empty List of Integer, " +
            "then return True")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator2 exterminator2 = new OddNumbersExterminator2();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = exterminator2.exterminate(emptyList);

        //Then
        assertEquals(emptyList, result);
    }


    @DisplayName("When Both List contain Even numbers" +
            "Then Return True")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator2 exterminator2 = new OddNumbersExterminator2();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            numbers.add(i);
        }

        //When
        List<Integer> testNumber = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (i % 2 != 0) {
                testNumber.add(i);
            }
        }

        //Then
        List<Integer> a = exterminator2.exterminate(numbers);
        List<Integer> b = exterminator2.exterminate(testNumber);
        assertEquals(a, b);
    }
}
