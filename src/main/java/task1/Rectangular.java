package com.company;

public class Rectangular extends Figure2D{
    double a;
    double b;
    public Rectangular(double a, double b){
        this.b = b;
        this.a = a;
    }
    public double perimetr(){
        double p = (a+b)*2;
        return p;
    }
    public double area() {
        double s = a*b;
        return s;
    }
}
