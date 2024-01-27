package org.lesson5.ex2;

public class Square extends Rectangle implements kwadrat {
    public Square(double sideA, double sideB) {
        super((int) sideA, (int) sideB);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimetr() {
        return super.getPerimeter();
    }
}

