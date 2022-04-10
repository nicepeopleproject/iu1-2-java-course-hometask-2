package Tests;


import task2.FixatedWorker;
import task2.HourWorker;
import task2.Worker;

public class WorkerTest {
    public static void main(String[] args) {
        FixatedWorker W1 = new FixatedWorker(1300);
        HourWorker W2 = new HourWorker(2);
        FixatedWorker W3 = new FixatedWorker(749);
        HourWorker W4 = new HourWorker(4);
        HourWorker W5 = new HourWorker(10);
        WorkerInfo(W1);
        WorkerInfo(W2);
        WorkerInfo(W3);
        WorkerInfo(W4);
        WorkerInfo(W5);
    }

    private static void WorkerInfo(Worker w){
        if (w.getClass() == task2.HourWorker.class){
            System.out.println("Рабочий с почасовой оплатой. Средьнемесячная зарплата: "+w.getSalary());
        }else if (w.getClass() == task2.FixatedWorker.class){
            System.out.println("Рабочий с фиксированной оплатой. Среднемесячная зарплата: "+w.getSalary());
        }
    }

}

