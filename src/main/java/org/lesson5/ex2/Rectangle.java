package org.lesson5.ex2;

public class Rectangle extends Shape {
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
