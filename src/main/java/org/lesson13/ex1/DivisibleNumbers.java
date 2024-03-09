package org.lesson13.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Locale.filter;

public class DivisibleNumbers {

    public static void main(String[] args) {
        getDivisibleNumbers(1, 150, 3);
    }

    static void getDivisibleNumbers (int rangeFrom, int rangeTo, int divisor) {
        List<Integer> divisibleNumber = new ArrayList<>();
        IntStream intStream = IntStream.of(rangeFrom,rangeTo);
        intStream.filter(number -> number % divisor == 0);
        intStream.forEach(divisibleNumber::add);
        System.out.println(divisibleNumber);
    }
}
