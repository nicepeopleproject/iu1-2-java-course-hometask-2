
package task1;

public class Rectangular extends Figure2D{
    private double a;
    private double b;

    public Rectangular(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area(){
        return a*b;
    }

    public double[] getPar(){
        return new double[]{a, b};
    }
}