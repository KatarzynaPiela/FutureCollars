package org.example.lesson2.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void isNumberEven() {
        //given
        int number = 6;
        boolean expResult = true;

        //when
        boolean result = Numbers.isNumberEven(number);
        //then
        Assertions.assertEquals(expResult, result);

    }
}