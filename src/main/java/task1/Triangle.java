package com.company;

public class Triangle extends Figure2D{
    double a;
    double b;
    double c;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimetr(){
        double p = a+b+c;
        return p;
    }
    public double area() {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
