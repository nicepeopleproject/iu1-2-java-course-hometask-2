package task2;

public class FixatedWorker extends Worker {

    public FixatedWorker(double salary) {
        super(salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
