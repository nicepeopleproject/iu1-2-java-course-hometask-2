package task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=1;
        while (i==1){
            System.out.println("Введите ФИО работника: ");

            String FIO=scan.nextLine();
            System.out.println("Выберете форму работы:\n\t1.Почасовая\n\t2.Фиксированная");
            int form=scan.nextInt();
            if (form==1){
                System.out.println("Введите ставку в час: ");
                double rateHour= scan.nextDouble();
                Workers workerHourPay=new HourPayment(FIO,rateHour);
                PrintWorkers(workerHourPay,form);
            }else if (form==2){
                System.out.println("Введите фиксированной месячной оплату: ");
                double rateFix= scan.nextDouble();
                Workers workerFixPay=new FixedPayment(FIO,rateFix);
                PrintWorkers(workerFixPay,form);
            }else{
                System.out.println("Ошибка");
            }
            System.out.println("Введите:\n\t1.Продолжить\n\t0.Выход");
            i=scan.nextInt();
            String defoult = scan.nextLine();
        }
    }
    public static void PrintWorkers(Workers worker, int formOfWork){
        System.out.println("ФИО работника: "+worker.FIO);
        if (formOfWork==1){System.out.println("Почасовая форма оплаты");}
        else if (formOfWork==2){System.out.println("Фиксированная форма оплаты");}
        System.out.println("среднемесячная зарплата = "+worker.payment());
    }
}
