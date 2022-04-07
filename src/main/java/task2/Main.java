package task2;

public class Main {

    public static void main(String[] args) {
	    HourEmployee vasya = new HourEmployee(250);
        System.out.println("Зарплата Васи за месяц: " + vasya.getSalary());
        MonthEmployee petya = new MonthEmployee(50000);
        System.out.println("Зарплата Пети за месяц: " + petya.getSalary());
    }
}
