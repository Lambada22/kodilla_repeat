package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
                .average()
                .getAsDouble();

        return average;

    }
}


//    OptionalDouble average = IntStream.range(0, numbers.length)
//            .average();
//
//    double av = average.empty().orElse(-1);
//    int avInt = (int) av;