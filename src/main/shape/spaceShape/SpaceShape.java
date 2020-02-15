package main.shape.spaceShape;

import main.interfaces.AreaMeasurable;
import main.interfaces.VolumeMeasurable;
import main.shape.Shape;

abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

    double side1;
    double side2;
    double side3;

}
