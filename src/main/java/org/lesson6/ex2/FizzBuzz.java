package org.lesson6.ex2;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isDivisible(i, 3)) {
                System.out.print("Fizz");
            }
            if (isDivisible(i, 5)) {
                System.out.print("Buzz");
            }
            if (isDivisible(i, 3) || isDivisible(i, 5)) {
                System.out.println();
            }

        }
    }

    public static boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }
}
