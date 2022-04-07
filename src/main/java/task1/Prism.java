package com.company;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        double v = base.area() * h;
        return v;
    }

    // площадь поверхности
    public double surfaceArea() {
        double sa = base.perimetr() * h + base.area()*2;
        return sa;
    }
}
