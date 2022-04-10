package task2;

class FixedPayment extends Employee {
    private double salary;

    FixedPayment(double salary) {
        this.salary = salary;
    }

    @Override
    double averageMonthlySalary() {
        return salary;
    }
}
