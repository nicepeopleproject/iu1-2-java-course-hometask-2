package task1;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Trapezoid implements Figure2D{
    // This is important
    private double base_a;
    private double base_b;

    // Variant № 1 - with height
    private double height;
    private boolean withHeight = false;  // checking for initialisation with height;

    // Variant № 2 - with two other side
    private double side_c;
    private double side_d;

    Trapezoid(double base_a, double base_b, double height) {
        this.base_a = base_a;
        this.base_b = base_b;
        this.height = height;
        this.withHeight = true;
    }

    Trapezoid(double base_a, double base_b, double side_c, double side_d) {
        this.base_a = base_a;
        this.base_b = base_b;
        this.side_c = side_c;
        this.side_d = side_d;
    }

    public double area() {
        if (withHeight) {
            return (base_a + base_b) / 2 * height;
        } else {
            double halfDifferenceOfBases = abs(base_b - base_a);
            return ((base_a + base_b) / 2) * sqrt(side_c * side_c -
                    Math.pow(((halfDifferenceOfBases * halfDifferenceOfBases + side_c * side_c - side_d * side_d) / (2 * halfDifferenceOfBases)), 2));
        }

    }

    public double perimeter() {
        if (withHeight) {
            double side = sqrt((height * height) + Math.pow(((abs(base_b - base_a)) / 2), 2));
            return base_a + base_b + side + side;
        } else {
            return base_a + base_b + side_d + side_c;
        }

    }
}
