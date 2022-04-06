package task1;

public class Circle extends Figure2D{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double area(){
        return Math.PI*r*r;
    }

    public double[] getParameters(){
        return new double[]{r};
    }
}
