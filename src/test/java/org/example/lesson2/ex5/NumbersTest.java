package org.example.lesson2.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void shouldReturnTrueIfNumberEven() {
        //given
        int number = 6;
        boolean expResult = true;

        //when
        boolean result = Numbers.isNumberEven(number);
        //then
        Assertions.assertEquals(expResult, result);

    }
}