package task1;

import static  java.lang.Math.pow;
import static  java.lang.Math.PI;

public class Circle implements Figure2D{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
}
