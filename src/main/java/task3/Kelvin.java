package task3;

public class Kelvin implements Converter{
    private double cels;

    public Kelvin(double cels){
        this.cels = cels;
    }

    public double convert(){return cels + 273.15;}

}