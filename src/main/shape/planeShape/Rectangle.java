package main.shape.planeShape;

import main.interfaces.AreaMeasurable;
import main.interfaces.PerimeterMeasurable;

public class Rectangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {

    private double xPoint1;
    private double yPoint1;

    public Rectangle(double xPoint1, double yPoint1, double side1, double side2) {
        this.xPoint1 = xPoint1;
        this.yPoint1 = yPoint1;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return side2 * 2 + side1 * 2;
    }

    @Override
    public String toString() {
        return "Rectangle \t| x " + xPoint1 + ", y : " + yPoint1 + ", Area : " + getArea() + ", Perimeter : " + getPerimeter();
    }
}
