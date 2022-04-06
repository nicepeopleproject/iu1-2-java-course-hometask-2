package task2;

public class FixedSalaryWorker extends Salary{
    private double monthSalary;

    public FixedSalaryWorker(double monthSalary){
        this.monthSalary = monthSalary;
    }

    public double calculateSalary(){
        return monthSalary;
    }
}
