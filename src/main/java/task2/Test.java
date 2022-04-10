package task2;

public class Test {
    public static void main(String[] args) {
        //Fixed Payment test
        System.out.println("---FIXED PAYMENT TEST---");
        FixedPayment FixedEmployeer = new FixedPayment(200000);
        System.out.println(FixedEmployeer.averageMonthlySalary());
        System.out.println();

        //Hourly Payment test
        System.out.println("---HOURLY PAYMENT TEST---");
        HourlyPayment HourlyEmployeer = new HourlyPayment(600);
        System.out.println(HourlyEmployeer.averageMonthlySalary());
        System.out.println();
    }
}
