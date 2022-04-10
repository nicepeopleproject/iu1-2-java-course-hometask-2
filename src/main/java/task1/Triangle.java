package task1;

public class Triangle extends Figure2D {
    private int a;
    private int b;
    private int c;
    private double P;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c=c;
        this.P=(a+b+c)/2;
        this.lengthOfFigure=a+b+c;
    }

    @Override
    double area() {
        return Math.sqrt(this.P*(this.P-this.a)*(this.P-this.b)*(this.P-this.c));
    }
}
