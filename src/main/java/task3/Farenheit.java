package task3;

public class Farenheit implements Converter{
    private double cels;

    public Farenheit(double cels){
        this.cels = cels;
    }

    public double convert(){
        return 9*cels/5 + 32;
    }
}