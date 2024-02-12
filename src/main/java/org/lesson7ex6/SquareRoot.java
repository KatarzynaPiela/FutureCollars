package org.lesson7ex6;

public class SquareRoot {

    public static double calculateRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }
}
