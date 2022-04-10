package task2;

public class FixedPayment extends Workers{
    public FixedPayment(String FIO,double payment){
        this.FIO=FIO;
        this.payment=payment;
    }

    @Override
    double payment() {
        return payment;
    }
}
