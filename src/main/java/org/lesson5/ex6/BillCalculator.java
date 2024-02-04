package org.lesson5.ex6;

public class BillCalculator {
    static double calculate(double billValue, float serviceFree) {
        return billValue + serviceFree;
    }
    static double calculate(double billValue, float serviceFree, double discount) {
        return billValue + serviceFree + discount;
    }
    static double calculate(double billValue, float serviceFree, short takeawayPackaging) {
        return serviceFree + takeawayPackaging - billValue;
    }
}



