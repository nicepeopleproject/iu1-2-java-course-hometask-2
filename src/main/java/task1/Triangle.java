package task1;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle extends Figure2D{
    private double firstTriangleSide;
    private double secondTriangleSide;
    private double thirdTriangleSide;

    public Triangle(double firstTriangleSide, double secondTriangleSide, double thirdTriangleSide) {
        this.firstTriangleSide = firstTriangleSide;
        this.secondTriangleSide = secondTriangleSide;
        this.thirdTriangleSide = thirdTriangleSide;
    }

    public double area() {
        double halfPerimetr = (this.firstTriangleSide + this.secondTriangleSide + this.thirdTriangleSide) / 2.0;
        return Math.sqrt(halfPerimetr * (halfPerimetr - this.firstTriangleSide) * (halfPerimetr - this.secondTriangleSide) * (halfPerimetr - this.thirdTriangleSide));
    }

    public double basePerimetr() {return this.firstTriangleSide + this.secondTriangleSide + this.thirdTriangleSide; }
}
