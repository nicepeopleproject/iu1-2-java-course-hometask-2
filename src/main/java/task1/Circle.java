package com.company;

public class Circle extends Figure2D {
    double rad;
    public Circle(double rad){
        this.rad = rad;
    }
    public double perimetr(){
        double p = 2*3.14*rad;
        return p;
    }
    public double area() {
        double s = 3.13*rad*rad;
        return s;
    }
}
