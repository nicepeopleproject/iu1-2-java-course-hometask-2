package com.company;

public class Trapezoid extends Figure2D{
    double mbase;
    double bbase;
    double side;
    public Trapezoid(double mbase, double bbase, double side){
        this.mbase = mbase;
        this.bbase = bbase;
        this.side = side;
    }
    public double perimetr(){
        return mbase+bbase+side+side;
    }
    public double area() {
        double h = side*side-((bbase-mbase)/2)*((bbase-mbase)/2);
        double s = ((mbase+bbase)/2)*h;
        return s;
    }
}
