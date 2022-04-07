package task3;

public class Kelvin implements  Converter{
    double Gradus;

    public Kelvin(double gradus) {
        Gradus = gradus;
    }

    public double convert() {
        return Gradus + 273;
    }
}
