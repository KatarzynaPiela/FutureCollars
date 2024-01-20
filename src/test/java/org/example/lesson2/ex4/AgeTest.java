package org.example.lesson2.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {
    @Test
    public void testCheckIfAdult() {
        //given
        int age = 10;
        boolean expectedResult = false;
        //when
        boolean result = Age.checkIfAdult(age);
        //then
        Assertions.assertEquals(expectedResult, result);


    }
}
