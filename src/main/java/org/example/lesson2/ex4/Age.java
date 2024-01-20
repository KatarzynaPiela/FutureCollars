package org.example.lesson2.ex4;

public class Age {
    public static void main(String[] args) {
        System.out.println("Its person adult:  " + checkIfAdult(18));
    }
    static boolean checkIfAdult(int age) {
        return age >= 18;

    }
}
