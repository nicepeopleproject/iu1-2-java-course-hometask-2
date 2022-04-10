package task3;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("Lets convert 100 degrees celsius to other units");
        System.out.println("100 degrees celsius equals " + DegreeConvertSystem.convert(100, "C", "F") + " degrees Fahrenheit");
        System.out.println("100 degrees celsius equals " + DegreeConvertSystem.convert(100, "C", "K") + " degrees Kelvin");

        System.out.println("-----------------------------------------------");
        System.out.println("Lets convert 247 degrees  Fahrenheit to other units");
        System.out.println("247 degrees celsius equals " + DegreeConvertSystem.convert(247, "F", "C") + " degrees celsius");
        System.out.println("247 degrees celsius equals " + DegreeConvertSystem.convert(247, "F", "K") + " degrees Kelvin");

        System.out.println("-----------------------------------------------");
        System.out.println("Lets convert 0 degrees  Kelvin to other units");
        System.out.println("0 degrees celsius equals " + DegreeConvertSystem.convert(0, "K", "C") + " degrees celsius");
        System.out.println("0 degrees celsius equals " + DegreeConvertSystem.convert(0, "K", "F") + " degrees Fahrenheit");

    }
}
