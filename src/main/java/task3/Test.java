package task3;

public class Test {
    public static void main(String[] args) {
        Kelvin kelvin = new Kelvin(10.0);
        Rankin rankin = new Rankin(10.0);
        Farenheit farenheit = new Farenheit(10.0);
        Reomur reomur = new Reomur(10.0);

        System.out.println(kelvin.convert());
        System.out.println(rankin.convert());
        System.out.println(farenheit.convert());
        System.out.println(reomur.convert());
    }
}
