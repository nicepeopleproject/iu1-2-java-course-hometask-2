package task3;

public class Reomur implements Converter{
    private double cels;

    public Reomur(double cels){
        this.cels = cels;
    }

    public double convert(){
        return cels*4/5;
    }

}