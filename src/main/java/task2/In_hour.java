package task2;

public class In_hour extends Rabotnik{
double zarabotok;

    public In_hour(double zarabotok) {
        this.zarabotok = zarabotok;
    }

    @Override
    double zp() {
        return 20.8*8*zarabotok;
    }
}
