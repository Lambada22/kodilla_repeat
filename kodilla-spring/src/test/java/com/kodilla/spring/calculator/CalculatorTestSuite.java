package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations(){
        //Given

        //When
        calculator.add(2.2,3.4);
        calculator.sub(6.6,0.1);
        calculator.mul(3.444,1.222);
        calculator.div(12.0,4.0);

        //Then

    }
}
