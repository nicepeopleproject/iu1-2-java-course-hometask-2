package task2;


public class Task2_Main {
    public static void main(String[] args){

        int formOfwork=0;
        System.out.println("_____________Test1____________");
        formOfwork=1;
        Workers workerHourPay=new HourPayment("Иванов Иван Иванович",450);
        PrintWorkers(workerHourPay, formOfwork);
        System.out.println("_____________Test2____________");
        formOfwork=2;
        Workers FixedPayment=new FixedPayment("Долгова Юлия Сергеевна",400000);
        PrintWorkers(FixedPayment, formOfwork);
    }

    public static void PrintWorkers(Workers worker, int formOfWork){
        System.out.println("ФИО работника: "+worker.FIO);
        if (formOfWork==1){System.out.println("Почасовая форма оплаты");}
        else if (formOfWork==2){System.out.println("Фиксированная форма оплаты");}
        System.out.println("среднемесячная зарплата = "+worker.payment());
    }
}
