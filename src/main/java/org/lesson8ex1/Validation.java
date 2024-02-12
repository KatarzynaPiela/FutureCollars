package org.lesson8ex1;

public class Validation {
        public static void main(String[] args) {
            validation(new int[]{2, 4, 6, 8, 10, 12});
        }
        public static void validation(int[] values) {
            for (int i = 0; i < values.length; i++) {
                try {
                    if (values[i] % 2 !=0) {
                        throw new IllegalArgumentException("Number:" + values[i] + "is not divisible by 2 !");
                    }
                    System.out.println("Number:" + values[i] + "is divisible by 2 !");
                } catch (IllegalArgumentException exception) {
                    System.out.println("Expection was throw, expection" + exception.getMessage());
                }
            }
        }
    }


