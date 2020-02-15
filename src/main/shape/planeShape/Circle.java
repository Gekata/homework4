package main.shape.planeShape;

import main.interfaces.AreaMeasurable;
import main.interfaces.PerimeterMeasurable;


public class Circle extends PlaneShape {
    private double xPoint1;
    private double yPoint1;
    private double radius;
    public Circle(double x1,double y1,double radius){
        this.radius = radius;
        this.xPoint1 = x1;
        this.yPoint1 = y1;
    }
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle \t| x : " + xPoint1 + ", y : " + yPoint1 + ", Perimeter : " + getPerimeter() + ", Area : " + getArea();
    }

}
