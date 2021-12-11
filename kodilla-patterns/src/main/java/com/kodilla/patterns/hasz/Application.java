package com.kodilla.patterns.hasz;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Students john = new Students("Johny", "Bravo", "1A");
        Students lincoln = new Students("Lincoln", "Cadillac", "2B");
        Students taylor = new Students("Taylor", "Swift", "3D");

        Grades gradesOfJohn = new Grades(2, 3, 4, 5);
        Grades gradesOfLincoln = new Grades(4.5, 2.5, 5, 6);
        Grades gradesOfTaylor = new Grades(5, 2, 4, 5);

        Map<Students, Grades> notes = new HashMap<>();
        notes.put(john, gradesOfJohn);
        notes.put(lincoln, gradesOfLincoln);
        notes.put(taylor, gradesOfTaylor);

        double sum = 0;

        for (Map.Entry<Students, Grades> average : notes.entrySet()) {
            System.out.println("Average Of Student: " + average.getKey().toString() + " is: " + (sum = average.getValue().getAverageOfGrades()));
        }
        System.out.println(sum);
    }
}
