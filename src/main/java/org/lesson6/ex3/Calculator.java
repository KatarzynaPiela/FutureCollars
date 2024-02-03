package org.lesson6.ex3;

import static java.lang.String.format;
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

    private Calculator type;
    private String Calculator;
    public byte[] formatCalculator2pdf() {
        return new byte[]; format();
        {

        }
    }
    private void format() {
    }


}

