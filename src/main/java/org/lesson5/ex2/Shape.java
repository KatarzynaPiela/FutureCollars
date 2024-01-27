package org.lesson5.ex2;

public abstract class Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Shape() {
    }

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return 0;
    }

    public abstract double getPerimeter();
}
