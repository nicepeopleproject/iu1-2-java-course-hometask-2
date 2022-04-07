package task1;

import static java.lang.Math.sqrt;

public class Triangle implements Figure2D{

    // This is important
    double side_a;

    // Variant № 1 - with height
    double height;
    boolean withHeight = false;  // checking for initialisation with height;

    // Variant № 2 - with two other side
    double side_b;
    double side_c;

    Triangle (double side_a, double height) {
        this.side_a = side_a;
        this.height = height;
        withHeight = true;
    }

    Triangle (double side_a, double side_b, double side_c){
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double area() {
        if (withHeight) {
            return side_a * height;
        } else {
            double semiPerimeter = (side_a + side_b + side_c) / 2;
            return sqrt(semiPerimeter * (semiPerimeter - side_a) * (semiPerimeter - side_b) * (semiPerimeter - side_c));
        }

    }

    public double perimeter() {
        if (withHeight) {
            double side = sqrt(height * height + Math.pow(side_a / 2, 2));
            return side + side + side_a;
        } else {
            return side_a + side_b + side_c;
        }
    }
}
