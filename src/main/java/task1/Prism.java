package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    public double volume() { return base.area() * h;}

    public double surfaceArea() { return base.basePerimetr() * h + 2 * base.area(); }
}
