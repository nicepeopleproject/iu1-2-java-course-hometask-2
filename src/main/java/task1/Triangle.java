package task1;

public class Triangle extends Figure2D{
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area(){
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    public double[] getPar(){
        return new double[]{a, b, c};
    }
}