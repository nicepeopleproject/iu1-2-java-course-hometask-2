package task3;

public class IntoFahrenhait extends ConverterClass implements Converter{


    public IntoFahrenhait(double unit,int conv){
        super(unit,conv);
    }

    @Override
    public double convert() {
        if (super.conv==1){
            //Цельсия
            return super.unit*1.8+32;
        }else if(super.conv==2){
            //Кельв
            return super.unit*1.8-459.67;
        }else {
            //Форенг
            return super.unit;
        }
    }
}
