package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator2 {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList<>();

        for (Integer no : numbers) {
            if (no % 2 != 0) {
                oddNumbersList.add(no);
            }
        }
        return oddNumbersList;
    }
}
