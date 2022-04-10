package task1;

import static  java.lang.Math.PI;

public class Circle extends Figure2D{
    private double circleRadius;

    public Circle(double circleRadius) { this.circleRadius = circleRadius; }

    public double area() { return PI * Math.pow(this.circleRadius, 2); }

    public double basePerimetr() { return 2 * PI * this.circleRadius; }
}
