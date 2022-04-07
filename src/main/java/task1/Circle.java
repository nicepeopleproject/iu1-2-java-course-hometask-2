package task1;

public class Circle implements Figure2D{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI*r*r;
    }

    public double Perimetr() {
        return Math.PI*r*2;
    }
}
