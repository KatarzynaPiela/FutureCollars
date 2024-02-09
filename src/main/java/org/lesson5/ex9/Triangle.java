package org.lesson5.ex9;

public class Triangle {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = 20;
        this.height =5;
    }
    @Override
    public String toString() {
        return "Triangle{width=<"+ width + ">, height=<"+ height + ">}";

    }
}
