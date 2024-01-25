package org.lesson4.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsConverterTest {

    @Test
    void shouldConvertMinutesToSeconds() {
        //given
        int minutes = 60;
        int expected = 3600;
        //when
        int result = MinutesToSecondsConverter.convertMinutesToSeconds(60);
        //then
        assertEquals(expected, result);

    }
}