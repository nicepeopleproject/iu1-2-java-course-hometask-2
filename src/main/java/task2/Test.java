package task2;


public class Test {
    public static void main(String[] args) {
        System.out.println();

        // MARK: TEST - 1 : Hourly Payment
        System.out.println("------- TEST - 1 : Hourly Payment ----------");
        HourlyPayment Sam_Smith = new HourlyPayment(1000);
        System.out.println(Sam_Smith.averageMonthlySalary());
        System.out.println("--------------------------------------------");
        System.out.println();

        // MARK: TEST - 2 : Fixed Payment
        System.out.println("------- TEST - 2 : Fixed Payment -----------");
        FixedPayment John_Pitt = new FixedPayment(160000);
        System.out.println(John_Pitt.averageMonthlySalary());
        System.out.println("--------------------------------------------");
        System.out.println();
    }
}
