package task3;

public class Rankin implements Converter{
    private double cels;

    public Rankin(double cels){
        this.cels = cels;
    }

    public double convert(){
        return (cels + 273.15)*9/5;
    }

}