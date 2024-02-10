package org.lesson7ex6;

public class SquareRoot {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static double calculateRoot(double number) throws IllegalAccessException {
        if (number < 0) {
            throw new IllegalAccessException();
        }
        return Math.sqrt(number);
    }
}
