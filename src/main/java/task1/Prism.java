package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        return this.base.area()*this.h;
    }

    // площадь поверхности
    public double surfaceArea() {
        return this.base.Perimetr()*this.h + 2*this.base.area();
    }
}
