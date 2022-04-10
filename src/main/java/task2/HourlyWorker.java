package task2;

public class HourlyWorker extends Worker {
    double PerHour;

    public HourlyWorker(double PerHour){
        this.PerHour = PerHour;
    }

    public double Salary(){
        return 20.8*8*PerHour;
    }

}
