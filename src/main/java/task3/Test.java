package task3;

public class Test {
    public static void main(String[] args) throws Exception {
        //Convert to Celsius test
        System.out.println("---CELSIUS TEST---");
        System.out.println("C to C:");
        System.out.println(Celsius.convert(100, "C"));
        System.out.println("K to C:");
        System.out.println(Celsius.convert(100, "K"));
        System.out.println("F to C:");
        System.out.println(Celsius.convert(100, "F"));
        System.out.println();

        //Convert to Kelvin test
        System.out.println("---KELVIN TEST---");
        System.out.println("C to K:");
        System.out.println(Kelvin.convert(100, "C"));
        System.out.println("K to K:");
        System.out.println(Kelvin.convert(100, "K"));
        System.out.println("F to K:");
        System.out.println(Kelvin.convert(100, "F"));
        System.out.println();

        //Convert to Fahrenheit test
        System.out.println("---FAHRENHEIT TEST---");
        System.out.println("C to F:");
        System.out.println(Fahrenheit.convert(100, "C"));
        System.out.println("K to F:");
        System.out.println(Fahrenheit.convert(100, "K"));
        System.out.println("F to F:");
        System.out.println(Fahrenheit.convert(100, "F"));
        System.out.println();
    }
}