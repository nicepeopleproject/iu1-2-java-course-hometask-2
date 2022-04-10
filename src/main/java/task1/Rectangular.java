package task1;

public class Rectangular extends Figure2D {
    private int length;
    private int width;

    public Rectangular(int length, int width) {
        this.length = length;
        this.width = width;
        this.lengthOfFigure=(length+width)*2;
    }

    @Override
    double area() {
        return this.width*this.length;
    }
}
