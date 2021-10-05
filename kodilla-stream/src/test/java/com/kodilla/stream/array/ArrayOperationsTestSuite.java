package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] figures = new int[]{
                1, 6, 2, 7, 2, 11, 33, 14, 7, 12, 57, 132, 90, 454, 8, 45, 121, 88, 125, 62
        };

        //When
        double ourAverage = ArrayOperations.getAverage(figures);

        //Then
        Assertions.assertEquals(ourAverage, 63.85, 0.01);
        System.out.println(ourAverage);

    }
}
