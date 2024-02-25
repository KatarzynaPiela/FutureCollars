package org.lesson8ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class MonthOfYearTest {

   @ParameterizedTest
    @CsvSource(value = {"JANUARY,1", "FEBRUARY,2","MARCH,3","APRIL,4","MAY,5","JUNE,6","JULY,7","AUGUST,8",
            "SEPTEMBER,9","OCTOBER,10","NOVEMBER,11","DECEMBER,12"})
    void shouldReturnMonthNumberForGivenEnumType(Month month, int expResult){
       int result = MonthOfYear.getMonthOfYear(month);
       Assertions.assertEquals(expResult,result);
   }
}