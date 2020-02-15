package main.shape.planeShape;

public class Triangle extends PlaneShape {
    private double xPoint1;
    private double yPoint1;
    private double xPoint2;
    private double yPoint2;
    private double xPoint3;
    private double yPoint3;

    public Triangle(double xPoint1, double yPoint1, double xPoint2, double yPoint2, double xPoint3, double yPoint3) {
        this.xPoint1 = xPoint1;
        this.xPoint2 = xPoint2;
        this.xPoint3 = xPoint3;
        this.yPoint1 = yPoint1;
        this.yPoint2 = yPoint2;
        this.yPoint3 = yPoint3;
    }

    @Override
    public double getPerimeter() {
        side1 = (Math.sqrt(Math.pow(xPoint1 + yPoint1, 2)) + Math.pow(xPoint2 + yPoint2, 2));
        side2 = (Math.sqrt(Math.pow(xPoint2 + yPoint2, 2)) + Math.pow(xPoint3 + yPoint3, 2));
        side3 = (Math.sqrt(Math.pow(xPoint1 + yPoint1, 2)) + Math.pow(xPoint3 + yPoint3, 2));
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public String toString() {
        return "Triangle \t| x1 : " + xPoint1 + ", y1 : " + yPoint1 + ", x2 : " + xPoint2 + ", y2 : " + yPoint2 + ", x3 : " + xPoint3 + ", y3 : " + yPoint3 +
                ", Perimeter : " + getPerimeter() + ", Area : " + getArea();
    }
}
