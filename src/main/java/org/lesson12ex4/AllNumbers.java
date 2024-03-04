package org.lesson12ex4;

import java.util.List;

public class AllNumbers {
    static String text = "342, 5.34, 756, 1.234e+07, 7.234243E-02, 6.09, 3457, 87, 1.0001, 3, 5";

    public static void main(String[] args) {
        Numbers numbers2 = new Numbers(text);
        List intigerList = numbers2.getIntegerNumbers();
        List floatingList = numbers2.getDecimalNumbers();
        List scientificList = numbers2.getScientificNumbers();
        System.out.println(intigerList);
        System.out.println(floatingList);
        System.out.println(scientificList);


    }

}
