package task3;

public class ConverterClass implements Converter{
    public double unit;
    public int conv;

    public ConverterClass(double unit,int conv){
        this.unit=unit;
        this.conv=conv;
    }

    @Override
    public double convert() {
        return 0;
    }
}
