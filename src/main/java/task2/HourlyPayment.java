package task2;

class HourlyPayment extends Employee {
    private double salary;

    HourlyPayment(double salary) {
        this.salary = salary;
    }

    @Override
    double averageMonthlySalary() {
        return salary * 20.8 * 8;
    }
}