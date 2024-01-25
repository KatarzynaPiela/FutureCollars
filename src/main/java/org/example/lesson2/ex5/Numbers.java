package org.example.lesson2.ex5;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(isNumberEven(5));
    }

    static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }
}
