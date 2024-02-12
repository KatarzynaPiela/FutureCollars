package org.lesson7.ex8;

public class Validation {
    public static void main(String[] args) {
        validation(new int[]{3, 6, 9, 15, 18, 21});
    }
    public static void validation(int[] values) {
        for (int i = 0; i < values.length; i++) {
            try {
                if (values[i] % 3 !=0) {
                    throw new IllegalArgumentException("Number:" + values[i] + "is not divisible by 3 !");
                }
                System.out.println("Number:" + values[i] + "is divisible by 3 !");
            } catch (IllegalArgumentException exception) {
                System.out.println("Expection was throw, expection" + exception.getMessage());
            }
        }
    }
}

