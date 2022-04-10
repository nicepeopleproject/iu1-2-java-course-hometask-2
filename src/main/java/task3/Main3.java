package task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=1;
        while(i!=0){
            System.out.println("Введите Систему счисления для перевода: \n\t1.Цельсий\n\t2.Кельвин\n\t3.Фаренгейт");
            int command= scan.nextInt();
            double unit=Unit();
            int conv=Command();

            switch (conv){
                case 1:
                    ConverterClass newCels=new IntoCelsius(unit,command);
                    Print(command,unit,conv,newCels);
                    break;
                case 2:
                    ConverterClass newKelv=new IntoKelvin(unit,command);
                    Print(command,unit,conv,newKelv);
                    break;
                case 3:
                    ConverterClass newFah=new IntoFahrenhait(unit,command);
                    Print(command,unit,conv,newFah);
                    break;
                default:
                    break;
            }
            System.out.println("Введите:\n\t1.Продолжить\n\t0.Выход");
            i=scan.nextInt();
        }

    }
    public static int Command(){
        Scanner scan=new Scanner(System.in);
        int conv=0;
        boolean AllRight=false;
        while (!AllRight){
            System.out.println("Введите Систему счисления, в которую необходимо перевести: \n\t1.Цельсий\n\t2.Кельвин\n\t3.Фаренгейт");
            conv= scan.nextInt();
            if (conv>0 && conv<4){
                AllRight=true;
            } else{System.out.println("Ошибка");}
        }
        return conv;
    }
    public static double Unit(){
        System.out.println("Введите значение: ");
        Scanner scan=new Scanner(System.in);
        return scan.nextDouble();
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
