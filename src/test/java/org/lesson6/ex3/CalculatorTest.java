package org.lesson6.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        //given
        double numberA = 30;
        double numberB = 2;
        char operator = '+';
        double expected = 32;

        //when
        double equation = Calculator.calculate(numberA, numberB, operator);

        //then
        Assertions.assertEquals(expected, equation);

    }

    @Test
    void shouldSubTwoNumbers() {
        //given
        double numberA = 30;
        double numberB = 2;
        char operator = '-';
        double expected = 28;

        //when
        double equation = Calculator.calculate(numberA, numberB, operator);

        //then
        Assertions.assertEquals(expected, equation);

    }
    @Test
    void shouldDivTwoNumbers() {
        //given
        double numberA = 30;
        double numberB = 2;
        char operator = '/';
        double expected = 15;

        //when
        double equation = Calculator.calculate(numberA, numberB, operator);

        //then
        Assertions.assertEquals(expected, equation);


    }
    @Test
    void shouldMulTwoNumbers() {
        //given
        double numberA = 30;
        double numberB = 2;
        char operator = '*';
        double expected = 60;

        //when
        double equation = Calculator.calculate(numberA, numberB, operator);

        //then
        Assertions.assertEquals(expected, equation);

    }

}

