package org.lesson8.ex2;


public class Numbers {
    public static boolean checkIsEven(int number) {
        return number % 2 == 0;

    }
    public static int calculateSum(int number){
        int result = 0;
        for(result = 0; number != 0; number= number / 10){
            result = result + number % 10;
        }
        return result;
    }
}

