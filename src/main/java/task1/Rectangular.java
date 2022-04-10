package task1;

public class Rectangular implements Figure2D{
    private double first_side;
    private double second_side;

    public Rectangular(double first_side, double second_side){
        this.first_side = first_side;
        this.second_side = second_side;
    }

    public double area(){
        return this.first_side * this.second_side;
    }

    public double perimeter(){
        return (this.first_side + this.second_side) * 2;
    }
}
