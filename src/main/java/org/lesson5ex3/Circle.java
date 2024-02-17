package org.lesson5ex3;

public class Circle implements GeometricFigures{

    private int radius;
    public Circle(int radius){this.radius = radius;}
    @Override
    public int getArea(){ return (int)(Math.PI * Math.pow(radius,4)); }
    @Override
    public int getPerimeter(){return (int)(2 * Math.PI * radius);}
}
