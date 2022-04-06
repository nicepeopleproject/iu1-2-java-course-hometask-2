package task2;

public class HourSalaryWorker extends Salary{
    private double hourSalary;

    public HourSalaryWorker(double hourSalary){
        this.hourSalary = hourSalary;
    }

    public double calculateSalary(){
        return 20.8*8*hourSalary;
    }
}
