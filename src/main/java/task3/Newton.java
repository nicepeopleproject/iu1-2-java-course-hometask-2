package task3;

public class Newton implements Converter{
    public Newton() {
    }

    @Override
    public void convert(double temp) {
        double newt = temp * 33 / 100;
        System.out.println("Температура в градусах Ньютона: " + newt);
    }
}
