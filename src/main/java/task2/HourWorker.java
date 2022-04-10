package task2;

public class HourWorker extends Worker{
    public HourWorker(double salary) {
        super(salary);
    }

    @Override
    public double getSalary() {
        return salary*20.8*8;
    }
}
