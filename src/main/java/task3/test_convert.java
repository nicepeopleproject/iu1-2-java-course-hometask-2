package task3;

public class test_convert {
    public static void main(String[] args) {
        Converter C1 = new farengate(5);
        System.out.println(C1.convert());

        Converter C2 = new Kelvin(5);
        System.out.println(C2.convert());
    }
}
