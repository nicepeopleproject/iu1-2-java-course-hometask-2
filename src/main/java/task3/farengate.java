package task3;

public class farengate implements Converter{
    double Gradus;

    public farengate(double gradus) {
        Gradus = gradus;
    }

    public double convert() {
        return Gradus*1.8 + 32;
    }
}
