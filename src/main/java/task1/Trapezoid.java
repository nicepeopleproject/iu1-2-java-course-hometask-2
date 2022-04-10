package task1;

import static java.lang.Math.*;

public class Trapezoid implements Figure2D{
    private double first_base;
    private double second_base;

    private double first_side;
    private double second_side;
    private double h;

    private boolean isHeightKnown;

    public Trapezoid(double first_base, double second_base, double h){
        this.first_base = first_base;
        this.second_base = second_base;
        this.h = h;

        this.isHeightKnown = true;
    }

    public Trapezoid(double first_base, double second_base, double first_side, double second_side){
        this.first_base = first_base;
        this.second_base = second_base;
        this.first_side = first_side;
        this.second_side = second_side;

        this.isHeightKnown = false;
    }

    public double area(){
        if(isHeightKnown){
            return (first_base + second_base) * h;
        }
        else{
            return (first_base + second_base) / 2 * sqrt(Math.pow(first_side, 2) - (Math.pow(first_base - second_base, 2) + Math.pow(first_side, 2) - Math.pow(second_side, 2)) / (2 * Math.abs(first_base - second_base)));
        }
    }

    public double perimeter(){
        return first_base + second_base + first_side + second_side;
    }
}
