package org.lesson8.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ChangingLettersTest {

    @Test
    void isTextContainingBigLetter() {
        String textToTest = "a";
        boolean result = ChangingLettersTest.isTextContainingBigLetter(textToTest);
        Assertions.assertTrue(result);
    }

}