package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Autowired
    private Display display;

    @Test
    public void testAddCalculations(){
        //Given
        //----- @Autovireds are given ------

        //When
        double add = calculator.add(6,6.5);
        double result = display.displayValue(12.5);

        //Then
        Assertions.assertEquals(result, add);
    }

    @Test
    public void testSubtractCalculations(){
        //Given
        //----- @Autovireds are given ------

        //When
        double substract = calculator.sub(10.5,6.5);
        double result = display.displayValue(4);

        //Then
        Assertions.assertEquals(result, substract);
    }

    @Test
    public void testMultiplicationCalculations(){
        //Given
        //----- @Autovireds are given ------

        //When
        double multiplication = calculator.mul(2.5,2);
        double result = display.displayValue(5);

        //Then
        Assertions.assertEquals(result, multiplication);
    }

    @Test
    public void testDivisionCalculations(){
        //Given
        //----- @Autovireds are given ------

        //When
        double division = calculator.div(10,2.5);
        double result = display.displayValue(4);

        //Then
        Assertions.assertEquals(result, division);
    }
}
