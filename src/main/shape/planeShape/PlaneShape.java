package main.shape.planeShape;

import main.interfaces.AreaMeasurable;
import main.interfaces.PerimeterMeasurable;
import main.shape.Shape;

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    double side1;
    double side2;
    double side3;


    public abstract double getArea();

    public abstract double getPerimeter();
}
