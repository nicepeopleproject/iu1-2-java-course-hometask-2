package task2;

public class HourlyWageWorker extends EmployeeSalary {
    private double ratePerHour;

    public HourlyWageWorker(double ratePerHour) { this.ratePerHour = ratePerHour; }

    @Override
    double averageMonthlySalary() {
        return 20.8 * 8 * this.ratePerHour;
    }
}
