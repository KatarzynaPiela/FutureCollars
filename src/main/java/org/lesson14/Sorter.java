package org.lesson14;

public class Sorter {


    Integer int1 = 200;
    static <T extends Number> void bubbleSorter (T[] numbers) {
        if (numbers.length == 0 || numbers == null) {
            return;
        }
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i].doubleValue() > numbers[i+1].doubleValue()) {
                    T tempValue = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i] = tempValue;

                }
            }
        }
    }
}
