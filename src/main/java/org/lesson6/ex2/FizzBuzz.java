package org.lesson6.ex2;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isDivisible(i, 3)) {
                //wyświetl fizz
            } else if (isDivisible(i, 5)) {
                // wyświetl buzz
            } else if (isDivisible(i, 3 / 5)) {
                // wyświetl fizzbuzz
            }
        }
    }

    public static boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }
}
