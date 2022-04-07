package task1;

public class Triangle implements Figure2D{
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }


    public double Perimetr() {
        return a+b+c;
    }
}
