package task3;

public class IntoKelvin extends ConverterClass implements Converter{
    public IntoKelvin(double unit,int conv){
        super(unit,conv);
    }

    @Override
    public double convert() {
        if (super.conv==1){
            //Цельсия
            //super.convert=super.unit+273.15;
            return super.unit+273.15;
        }else if(super.conv==2){
            //Кельв
            //super.convert=super.unit;
            return super.unit;
        }else {
            //Форенг
            //super.convert=(super.unit+459.67)/1.8;
            return (super.unit+459.67)/1.8;
        }
    }
}
