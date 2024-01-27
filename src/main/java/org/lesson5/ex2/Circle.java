package org.lesson5.ex2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius;

    }

    @Override
    public double getPerimeter() {
        return radius;
    }
}
