package main.shape.spaceShape;

public class Cuboid extends SpaceShape {

    public Cuboid(double xPoint1, double yPoint1, double zPoint1, double side1, double side2, double side3) {
        this.xPoint1 = xPoint1;
        this.yPoint1 = yPoint1;
        this.zPoint1 = zPoint1;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getVolume() {
        return side1 * side2 * side3;
    }

    @Override
    public double getArea() {
        return side3 * side1 * 2 + side3 * side2 * 2 + side2 * side1 * 2;
    }

    @Override
    public String toString() {
        return "Cuboid \t| x :" + xPoint1 + ", y : " + yPoint1 + ", z : " + zPoint1 + ", Volume : " + getVolume() + ", Perimeter : " + getArea();
    }
}
