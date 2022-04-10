package task3;

public class Kelvin implements Converter{
    public Kelvin() {
    }

    @Override
    public void convert(double temp) {
        System.out.println("Температура в Кельвинах : " + (temp + 273.15));
    }
}
