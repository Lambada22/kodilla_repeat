package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Odd Numbers Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: BEGIN");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: END");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: BEGIN");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: END");
    }

    @DisplayName("When List numbers is empty" +
            "then emptyList and result should be equal"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, result);
    }


    @DisplayName("When bothNumbers contains Odd and Even numbers" +
            " then ASSERTION should return  FALSE")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> bothNumbers = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            bothNumbers.add(i + 1);
        }

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(bothNumbers);
        System.out.println("Testing bothNumbers");

        List<Integer> expectedList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            if (i % 2 != 0) {
                expectedList.add(i);
            }
        }

        //Then
        System.out.println(bothNumbers);
        System.out.println(expectedList);
        Assertions.assertNotSame(resultList, expectedList);
    }
}
