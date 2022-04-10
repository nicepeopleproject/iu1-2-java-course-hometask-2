package task1;

public class Circle implements Figure2D{
    protected double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
