package main.shape.spaceShape;

public class SquarePyramid extends SpaceShape {

    public SquarePyramid(double yPoint1, double xPoint1, double zPoint1, double widthMain, double high) {
        this.yPoint1 = yPoint1;
        this.xPoint1 = xPoint1;
        this.zPoint1 = zPoint1;
        this.side1 = widthMain;
        this.side2 = high;
    }

    @Override
    public double getVolume() {
        return (Math.pow(side1, 2) * side2) / 3;
    }

    @Override
    public double getArea() {
        return Math.pow(side1, 2) + side1 * Math.sqrt(Math.pow(side1, 2) +
                +4 * Math.pow(side2, 2));
    }

    @Override
    public String toString() {
        return "Square pyramid \t| x : " + xPoint1 + ", y : " + yPoint1 + ", z : " + zPoint1 + ", Area : " + getArea() + ", Volume : " + getVolume();
    }
}
