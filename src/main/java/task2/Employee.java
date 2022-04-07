package task2;

abstract class Employee {
    abstract double averageMonthlySalary();
}


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