package org.lesson8.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void shouldReturnNull() {
        //given
        String text = null;
        //when
        String result =  Text.textToUpperCase(text);
        //then
        assertNull(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"text", "Text", "TEXT"})
    void shouldFormatToUpperCase(String text) {
        //when
        String result =  Text.textToUpperCase(text);
        //then
        assertEquals(result, "TEXT");

    }
}