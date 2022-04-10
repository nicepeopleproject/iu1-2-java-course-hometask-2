package task1;

public class Rectangular implements Figure2D{
    protected double length;
    protected double width;

    public Rectangular(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
