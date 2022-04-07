package task2;

public class fixed extends Rabotnik {
    double fixed;

    public fixed(double fixed) {
        this.fixed = fixed;
    }

    @Override
    double zp() {
        return fixed;
    }
}
