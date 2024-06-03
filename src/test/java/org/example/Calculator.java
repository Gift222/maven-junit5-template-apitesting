package org.example;

public class Calculator {
    // Method to subtract two integers
    public int subtractTwoValues(int firstInputValue, int secondInputValue) {
        int result = firstInputValue - secondInputValue;
        return result;
    }

    //method to add two values task 2
    public double addTwoValues(double firstInputValue, double secondInputValue) {
        double result = firstInputValue + secondInputValue;
        return result;
    }

    //Method to divide two  values
    public float divisionOfTwoValues(float firstInputValue, float secondInputValue) {
        float result = firstInputValue / secondInputValue;
        return result;
    }

    // method to multiply two values
    public double multiplyTwoValues(double firstInputValue, double secondInputValue) {
        double result = firstInputValue * secondInputValue;
        return result;
    }

    // method to check if the first argument is greater than the second
    public boolean more(int firstInputValue, int secondInputValue) {
        return firstInputValue > secondInputValue;

    }
}
