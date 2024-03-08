package org.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    static Stream<Arguments> providesArgumentsForSorter() {
        return Stream.of(
                Arguments.of(new Integer[]{5, 15, -9, 100, -5, 0, 14}, new Integer[]{-9, -5, 0, 5, 14, 15, 100}),
                Arguments.of(new Double[]{1.1, 9.0, -7.0, 0.2, 1.0, 2.4, 8.3, -6.5}, new Double[]{-7.0, -6.5, 0.2, 1.0, 1.1, 2.4, 8.3, 9.0})
        );
    }


    @ParameterizedTest
    @MethodSource("providesArgumentsForSorter")
    void shouldReturnSortedNumbers(Number[] input, Number[] expectedResult){
        //when
        Sorter.bubbleSorter(input);

        //then
        Assertions.assertArrayEquals(expectedResult, input);
    }
}