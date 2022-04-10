package task1;

public class Circle extends Figure2D {
    private int r;

    public Circle(int r) {
        this.r = r;
        this.lengthOfFigure=2*3.14*r;
    }

    @Override
    double area() {
        return 3.14*this.r*this.r;
    }
}
