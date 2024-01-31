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

    public abstract double getArea();

    public abstract double getPerimeter();
}
