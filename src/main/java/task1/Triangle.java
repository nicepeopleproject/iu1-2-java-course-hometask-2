package task1;

public class Triangle implements Figure2D{
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p - side3)*(p - side2)*(p - side1));
    }
}
