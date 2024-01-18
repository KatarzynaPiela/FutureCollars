package org.example.lesson2.ex3;

public class Calculator {

    static double calculate(double numberA, double numberB, char sign) {
        double result = 0;
        switch (sign) {
            case '+':
                result = numberA + numberB;
                break;
            case '-':
                result = numberA - numberB;
                break;
            case '/':
                result = (numberB != 0) ? numberA / numberB : 0;
                break;
            case '*':
                result = numberA * numberB;

        }
        return result;
    }


}

