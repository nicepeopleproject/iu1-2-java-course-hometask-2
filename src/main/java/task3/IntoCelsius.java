package task3;

public class IntoCelsius extends ConverterClass implements Converter{
    public IntoCelsius(double unit,int conv){
        super(unit,conv);
    }

    @Override
    public double convert() {
        if (super.conv==1){
            //Цельсия
            return super.unit;
        }else if(super.conv==2){
            //Кельв
            return super.unit-273.15;
        }else {
            //Форенг
            return (super.unit-32)/1.8;
        }
    }
}
