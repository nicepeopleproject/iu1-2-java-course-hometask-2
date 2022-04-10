package task1;

public class Trapezoid extends Figure2D {
    private double firstTrapezoidSide;
    private double secondTrapezoidSide;
    private double trapezoidHeight;

    private double firstSide;
    private double secondSide;

    public Trapezoid(double firstTrapezoidSide, double secondTrapezoidSide, double trapezoidHeight) {
        this.firstTrapezoidSide = firstTrapezoidSide;
        this.secondTrapezoidSide = secondTrapezoidSide;
        this.trapezoidHeight = trapezoidHeight;
    }

    public Trapezoid(double firstTrapezoidSide, double secondTrapezoidSide, double firstSide, double secondSide, double trapezoidHeight) {
        this.firstTrapezoidSide = firstTrapezoidSide;
        this.secondTrapezoidSide = secondTrapezoidSide;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.trapezoidHeight = trapezoidHeight;
    }

    public double area() { return ((this.firstTrapezoidSide + this.secondTrapezoidSide) / 2.0) * trapezoidHeight; }

    public double basePerimetr() {
        return this.firstTrapezoidSide + this.secondTrapezoidSide + this.firstSide + this.secondSide;
    }
}
