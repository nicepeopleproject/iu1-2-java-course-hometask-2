package task1;

public class Circle implements Figure2D{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.1415 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.1415 * radius;
    }
}
