package task1;

public class Circle extends Figure2D{
    private double rad;

    public Circle(double rad){
        this.rad = rad;
    }

    public double area(){
        return Math.PI*rad*rad;
    }

    public double[] getPar(){
        return new double[]{rad};
    }
}