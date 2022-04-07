package task2;

public class test_zp {
    public static void main(String[] args) {
        Rabotnik R1 = new In_hour(500);
        System.out.println(R1.zp());

        Rabotnik R2 = new fixed(50000);
        System.out.println(R2.zp());
    }
}
