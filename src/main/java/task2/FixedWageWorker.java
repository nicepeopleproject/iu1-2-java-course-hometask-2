package task2;

public class FixedWageWorker extends EmployeeSalary{
    private double fixedSalary;

    public FixedWageWorker(double fixedSalary) { this.fixedSalary = fixedSalary; }

    @Override
    double averageMonthlySalary() { return this.fixedSalary; }
}
