package task1;

public class Rectangular implements Figure2D{
    private double side_a;
    private double side_b;

    public Rectangular(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double area() {
        return side_a * side_b;
    }

    public double perimeter() {
        return (side_a + side_b ) * 2;
    }
}
