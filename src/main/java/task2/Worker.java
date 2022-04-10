package task2;

public abstract class Worker {
    protected double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    public abstract double getSalary();
}
