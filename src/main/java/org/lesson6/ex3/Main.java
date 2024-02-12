package org.lesson6.ex3;

public class Main {
    public static void main(String[] args) {

        double addition = Calculator.calculate(30, 2, '+');
        System.out.println(addition);
        double subtraction = Calculator.calculate(30, 2, '-');
        System.out.println(subtraction);
        double division = Calculator.calculate(30, 2, '/');
        System.out.println(division);
        double multiplication = Calculator.calculate(30, 2, '*');
        System.out.println(multiplication);


    }
}

