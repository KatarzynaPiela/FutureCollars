package org.lesson14;

public class Pair <K,V> {
    private  K valueA;
    private  V valueB;

    public Pair (K valueA, V valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public K getPrimaryValue() {
        return valueA;
    }

    public V getSecondaryValue() {
        return valueB;
    }
}


