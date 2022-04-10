package task3;

public class Fahrenheit implements Converter{

    public Fahrenheit() {
    }

    @Override
    public void convert(double temp) {
        System.out.println("Температура в градусах Фарингейта: " + (temp * (9/5) + 32));
    }
}
