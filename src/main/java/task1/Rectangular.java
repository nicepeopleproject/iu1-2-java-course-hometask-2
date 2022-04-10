package task1;

public class Rectangular extends Figure2D{
    private double width;
    private double height;

    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() { return (this.width * this.height); }

    public double basePerimetr() { return (this.width + this.height) * 2.0; }
}
