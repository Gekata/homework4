package main.shape.spaceShape;

public class Sphere extends SpaceShape {

    public Sphere(double xPoint1, double yPoint1, double zPoint1, double radius) {
        this.xPoint1 = xPoint1;
        this.yPoint1 = yPoint1;
        this.zPoint1 = zPoint1;
        this.side1 = radius;
    }

    @Override
    public double getArea() {
        return PI * 4 * Math.pow(side1, 2);
    }

    @Override
    public double getVolume() {
        return (double) 4 / 3 * PI * Math.pow(side1, 2);
    }

    @Override
    public String toString() {
        return "Sphere \t| x : " + xPoint1 + ", y : " + yPoint1 + ", z : " + zPoint1 + ", Area : " + getArea() + ", Volume : " + getVolume();
    }
}
