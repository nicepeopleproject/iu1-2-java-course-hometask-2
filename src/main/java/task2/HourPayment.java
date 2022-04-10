package task2;

public class HourPayment extends Workers{
    public HourPayment(String FIO,double payment){
        this.FIO=FIO;
        this.payment=payment;
    }

    @Override
    double payment() {
        return 20.8*8*this.payment;
    }
}
