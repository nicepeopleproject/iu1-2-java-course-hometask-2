package task1;

public class Trapezoid implements Figure2D{
    protected double base1;
    protected double base2;
    protected double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        return (base1+base2)*height/2;
    }
}
