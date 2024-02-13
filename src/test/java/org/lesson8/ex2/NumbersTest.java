package org.lesson8.ex2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void checkIsEven_shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(Numbers.checkIsEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    void checkIsEven_shouldReturnFalseForOddNumbers(int number){
        assertFalse(Numbers.checkIsEven(number));
    }


    @ParameterizedTest
    @CsvSource(value ={"111;3" , "432;9", "222;6"}, delimiter = ';')
    void calculateSum_shouldReturnSumForGivenNumbers(int number, int expected) {
        assertEquals(expected, Numbers.calculateSum(number));
    }
}