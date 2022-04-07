package task1;

public class Rectangular implements Figure2D{
    double a, b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a*b;
    }

    public double Perimetr() {
        return (a+b)*2;
    }
}
