package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test- pierwszy test jednostkowy: ");




        int a = 5;
        int b = 3;
        Calculator calculator = new Calculator();

        int addResult = calculator.add(11, 22);
        int substrResult = calculator.subtract(a, b);
        System.out.println(substrResult);

        if ((addResult == 8) && (substrResult == 2)) {
            System.out.println("Calculator works Perfectly!");
        } else {
            System.out.println("Coś nie Halo!");
        }
    }
}
