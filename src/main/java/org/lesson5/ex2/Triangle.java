package org.lesson5.ex2;

public class Triangle extends Shape implements trójkąt {
    private double a;

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB);
        this.sideC = sideC;

    }

    @Override
    public double getArea() {
        a = getPerimeter() / 2;
        return Math.sqrt(a * (a - sideA) * (a - sideB) * (a - sideC));
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getPerimetr() {
        return sideA + sideB + sideC;
    }

}
