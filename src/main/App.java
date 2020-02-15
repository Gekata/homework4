package main;

import main.shape.planeShape.Triangle;
import main.shape.planeShape.Rectangle;
import main.shape.Shape;
import main.shape.planeShape.Circle;
import main.shape.spaceShape.SquarePyramid;
import main.shape.spaceShape.Sphere;
import main.shape.spaceShape.Cuboid;

public class App {
    public static void begin() {
        Shape[] array = {new Sphere(12.0, 14.0, 20.0, 30),
                new Cuboid(15, 13, 15, 11, 12, 14),
                new SquarePyramid(12, 13, 15, 15, 14),
                new Triangle(15, 11, 12, 22, 25, 9),
                new Circle(14, 13, 25),
                new Rectangle(14, 24, 21, 32)};
        for (Shape value : array) System.out.println(value);

    }
}
