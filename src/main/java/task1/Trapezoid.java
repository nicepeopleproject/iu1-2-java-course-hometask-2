package task1;

public class Trapezoid implements Figure2D{
    double a, b, c, d;

    public Trapezoid(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {
        return ((a + b) / 2) * Math.pow((c * c - Math.pow((((b-a)*(b-a)+c*c-d*d)/(2*(b-a))),2)),0.5);
    }

    public double Perimetr() {
        return a+b+c+d;
    }
}
