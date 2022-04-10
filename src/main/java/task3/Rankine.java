package task3;

public class Rankine implements Converter{
    public Rankine() {
    }

    @Override
    public void convert(double temp) {
        double ran = (temp + 273.15) * 9 / 5;
        System.out.println("Температура в градусах Ранкина: " + ran);
    }
}
