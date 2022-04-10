package task1;

public class Test {
    public static void main(String[] args) {
        //Circle based prism test

        Circle circle = new Circle(10);
        Prism prismCircle = new Prism(circle, 10);
        System.out.println("---CIRCLE BASED PRISM TEST---");
        System.out.println("Prism volume = " + prismCircle.volume());
        System.out.println("Prism surface area = " + prismCircle.surfaceArea());
        System.out.println();

        //Rectangular based prism test
        Rectangular rectangular = new Rectangular(10, 20);
        Prism prismRectangular = new Prism(rectangular, 10);
        System.out.println("--- RECTANGULAR BASED PRISM TEST---");
        System.out.println("Prism volume = " + prismRectangular.volume());
        System.out.println("Prism surface area = " + prismRectangular.surfaceArea());
        System.out.println();

        //Trapezoid with height based prism test
        Trapezoid trapezoidWithH = new Trapezoid(10, 20, 5);
        Prism prismTrapezoidWithH = new Prism(trapezoidWithH, 10);
        System.out.println("---TRAPEZOID WITH HEIGHT BASED PRISM TEST---");
        System.out.println("Prism volume = " + prismTrapezoidWithH.volume());
        System.out.println("Prism surface area = " + prismTrapezoidWithH.surfaceArea());
        System.out.println();

        //Trapezoid without height based prism test
        Trapezoid trapezoidWithoutH = new Trapezoid(10, 18, 5, 5);
        Prism prismTrapezoidWithoutH = new Prism(trapezoidWithoutH, 10);
        System.out.println("---TRAPEZOID WITHOUT HEIGHT BASED PRISM TEST---");
        System.out.println("Prism volume = " + prismTrapezoidWithoutH.volume());
        System.out.println("Prism surface area = " + prismTrapezoidWithoutH.surfaceArea());
        System.out.println();

        //Triangle with height based prism test
        Triangle triangleWithH = new Triangle(8, 3);
        Prism prismTriangleWithH = new Prism(triangleWithH, 10);
        System.out.println("---TRIANGLE WITH HEIGHT BASED PRISM TEST---");
        System.out.println("Prism volume = " + prismTriangleWithH.volume());
        System.out.println("Prism surface area = " + prismTriangleWithH.surfaceArea());
        System.out.println();

        //Triangle without height based prism test
        Triangle triangleWithoutH = new Triangle(10, 12, 13);
        Prism prismTriangleWithoutH = new Prism(triangleWithoutH, 10);
        System.out.println("---TRIANGLE WITHOUT HEIGHT BASED PRISM TEST---");
        System.out.println("Prism volume = " + prismTriangleWithoutH.volume());
        System.out.println("Prism surface area = " + prismTriangleWithoutH.surfaceArea());
        System.out.println();

    }
}
