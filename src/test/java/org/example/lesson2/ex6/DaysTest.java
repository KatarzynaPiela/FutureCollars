package org.example.lesson2.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysTest {

    @Test
    void dayOfWeekMonday() {
        //given
        int dayNumber = 1;
        String expResult = "Monday";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void dayOfWeekTuesday() {
        //given
        int dayNumber = 2;
        String expResult = "Tuesday";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);

    }

    @Test
    void dayOfWeekWednesday() {
        //given
        int dayNumber = 3;
        String expResult = "Wednesday";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void dayOfWeekThursday() {
        //given
        int dayNumber = 4;
        String expResult = "Thursday";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);

    }

    @Test
    void dayOfWeekFriday() {
        //given
        int dayNumber = 5;
        String expResult = "Friday";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);

    }
    @Test
    void dayOfWeekWeekendSaturday() {
        //given
        int dayNumber = 6;
        String expResult = "Weekend";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);

    }
    @Test
            void thereIsNoSuchAday() {

        //given
        int dayNumber = 0;
        String expResult = "There is no such a day!";
        //when
        String result = Days.dayOfWeek(dayNumber);
        //then
        Assertions.assertEquals(expResult, result);
    }

}

















