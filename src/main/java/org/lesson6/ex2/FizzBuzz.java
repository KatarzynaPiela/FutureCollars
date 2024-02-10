package org.lesson6.ex2;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isDivisible(i, 3)) {
                //wyświetl fizz
            } else if (isDivisible(i, 5)) {
                // wyświetl buzz
            boolean test =  (isDivisible(3) && isDivisible(5));
                // wyświetl fizzbuzz
            }
        }
    }

    private static boolean isDivisible(int i) {
        return false;
    }

    public static boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }
}
