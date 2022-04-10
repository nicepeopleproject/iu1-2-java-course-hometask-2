package task3;


public class Test3_Main {
    public static void main(String[] args){
        System.out.println("_____________Test1____________");
        ConverterClass newCelsToKelv=new IntoCelsius(12,2);
        Print(1,12,2,newCelsToKelv);
        System.out.println("_____________Test2____________");
        ConverterClass newCelsToFor=new IntoCelsius(12,3);
        Print(1,12,3,newCelsToFor);
        System.out.println("_____________Test3____________");
        ConverterClass newKelvToCels=new IntoKelvin(0,1);
        Print(2,0,1,newKelvToCels);
        System.out.println("_____________Test4____________");
        ConverterClass newKelvToFor=new IntoKelvin(10,3);
        Print(2,10,3,newKelvToFor);
        System.out.println("_____________Test5____________");
        ConverterClass newForToCels=new IntoFahrenhait(12,1);
        Print(3,12,1,newForToCels);
        System.out.println("_____________Test5____________");
        ConverterClass newForToKelv=new IntoFahrenhait(300,2);
        Print(3,300,2,newForToKelv);

    }


    public static void Print(int command, double unit, int conv,ConverterClass convertation){
        String result =""+unit;
        if (command==1){result+=" С";}
        else if (command==2){result+=" K";}
        else if (command==3){result+=" F";}
        result+=" = "+convertation.convert();
        if (conv==1){result+=" С";}
        else if (conv==2){result+=" K";}
        else if (conv==3){result+=" F";}
        System.out.println(result);

    }
}
