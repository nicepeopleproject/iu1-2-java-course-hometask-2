package task1;

public class Trapezoid extends Figure2D{
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapezoid(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area(){
        double A = ((b-a)*(b-a) + c*c - d*d)/(2*(b-a));
        return ((a + b)/2)*Math.sqrt(c*c - Math.pow(((b-a)*(b-a) + c*c - d*d)/(2*(b-a)),2));
    }

    public double[] getPar(){
        return new double[]{a, b, c, d};
    }
}