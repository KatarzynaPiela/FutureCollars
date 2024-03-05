package org.lesson13.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Locale.filter;

public class DivisibleNumbers {

    public static void main(String[] args) {
        List<Integer> divisibleNumber = new ArrayList<>();
        IntStream intStream = IntStream.of(1,150);
        intStream.filter(number -> number % 3 == 0);
                intStream.forEach(divisibleNumber::add);
        System.out.println(divisibleNumber);


}
}
