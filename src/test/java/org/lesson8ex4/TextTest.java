package org.lesson8ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    private static Stream<Arguments> checkHowLongIsText() {
        return Stream.of(
                Arguments.of("Text", 4),
                Arguments.of("Car", 3),
                Arguments.of("House"),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("checkHowLongIsText")
    void shouldReturnTextLength(String input, int expected) {
        //given
        //when
        int actualLength = Text.getTextLength(input);
        //then
        Assertions.assertEquals(expected, actualLength);
    }
}


