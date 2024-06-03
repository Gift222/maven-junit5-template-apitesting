package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void subtractTwoPositiveValues() {
        //creating instance of the calculator class
        Calculator myCalculator = new Calculator();
        // subtracting two value and provide the value
        int actualValue = myCalculator.subtractTwoValues(8, 4);
        assertEquals(4, actualValue);
    }

    @Test
    public Calculator sumOfTwoValues() {
        //Creating instance of the calculator class
        Calculator myCalculator = new Calculator();
        //adding TwoValues
        double actualValue = myCalculator.addTwoValues(3, 3);
        assertEquals(6, actualValue);
        return myCalculator;
    }

    @Test
    public void divisionOfTwoValues() {
        Calculator myCalculator = new Calculator();
        float actualValue = myCalculator.divisionOfTwoValues(8, 2);
        assertEquals(4, actualValue);
    }

    @Test
    public void multiplyTwoValues() {
        Calculator myCalculator = new Calculator();
        double actualValue = myCalculator.multiplyTwoValues(3, 3);
        assertEquals(6, actualValue);
    }

    @Test
    public void checkTwoValuesIsGreater() {
        Calculator myCalculator = new Calculator();
        // Test the more method
        boolean actualValue = myCalculator.more(18, 10);
        assertEquals(18, actualValue);
    }


