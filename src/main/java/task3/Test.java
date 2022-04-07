package task3;

public class Test {
    public static void main(String[] args) throws Exception {

        System.out.println();

        // MARK: TEST - 1 : Convert to Kelvin
        System.out.println("------- TEST - 1 : Convert to Kelvin ----------");
        System.out.println("Conversion K -> K:");
        System.out.println(Kelvin.convert(103, "K"));
        System.out.println("Conversion C -> K:");
        System.out.println(Kelvin.convert(103, "C"));
        System.out.println("Conversion F -> K:");
        System.out.println(Kelvin.convert(103, "F"));
        System.out.println("------------------------------------------------");
        System.out.println();

        // MARK: TEST - 2 : Convert to Celsius
        System.out.println("------- TEST - 2 : Convert to Celsius ----------");
        System.out.println("Conversion C -> C:");
        System.out.println(Celsius.convert(103, "C"));
        System.out.println("Conversion K -> C:");
        System.out.println(Celsius.convert(103, "K"));
        System.out.println("Conversion F -> C:");
        System.out.println(Celsius.convert(103, "F"));
        System.out.println("------------------------------------------------");
        System.out.println();

        // MARK: TEST - 3 : Convert to Fahrenheit
        System.out.println("------- TEST - 3 : Convert to Fahrenheit -------");
        System.out.println("Conversion C -> F:");
        System.out.println(Fahrenheit.convert(103, "C"));
        System.out.println("Conversion K -> F:");
        System.out.println(Fahrenheit.convert(103, "K"));
        System.out.println("Conversion F -> F:");
        System.out.println(Fahrenheit.convert(103, "F"));
        System.out.println("------------------------------------------------");
        System.out.println();
    }
}
