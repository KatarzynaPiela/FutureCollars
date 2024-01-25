package org.lesson4.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    void shouldReturnTrueIfRectangularTriangle() {
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        //when
        boolean result = Triangle.isRectangularTriangle(a, b, c);
        //then
        Assertions.assertTrue(result);
    }
}