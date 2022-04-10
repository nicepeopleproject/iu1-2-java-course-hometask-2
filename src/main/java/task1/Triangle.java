package task1;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle implements Figure2D{
    private double first_side;
    private  double second_side;
    private  double third_side;
    private double h; // Height related to first_side
    private boolean isHeightKnown;

    public Triangle(double first_side, double h){
        this.first_side = first_side;
        this.h = h;

        this.isHeightKnown = true;
    }

    public Triangle(double first_side, double second_side, double third_side){
        this.first_side = first_side;
        this.second_side = second_side;
        this.third_side = third_side;

        this.isHeightKnown = false;
    }

    public double area() {
        if(isHeightKnown){
            return first_side * h / 2;
        }
        else{
            double half_perimeter = perimeter() / 2;
            return Math.sqrt(half_perimeter * (half_perimeter - first_side) * (half_perimeter - second_side) * (half_perimeter - third_side));
        }
    }

    public double perimeter(){
        if(isHeightKnown){
            second_side = sqrt(h * h + Math.pow(first_side/2, 2)); // Consider that the height is the median (Without this, there are not enough conditions in the task)
            third_side = second_side;
        }
        return first_side + second_side + third_side;

    }
}
