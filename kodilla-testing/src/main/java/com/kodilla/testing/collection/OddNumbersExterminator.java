package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbersList.add(number);
            }
        }

//        for (int n = 0; n <= oddNumbersList.size(); n++) {
//            if (n % 2 != 0) {
//                oddNumbersList.add(n);
//            }
//        }
        return oddNumbersList;
    }

}
