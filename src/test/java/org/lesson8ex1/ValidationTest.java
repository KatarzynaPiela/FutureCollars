package org.lesson8ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void main() {
    }

    @Test
    void validation() {
    }
    @ParameterizedTest
    @EmptySource
    void shouldVerifyEmptyStringIsPolidrome(String input) {
        Assertions.assertFalse(Sample.isPolidrome(input));
    }

}