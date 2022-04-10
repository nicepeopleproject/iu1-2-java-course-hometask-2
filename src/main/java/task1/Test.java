package task1;

public class Test {
    public static void main(String[] args) {
        //Circle based prism test
        System.out.println("--------------------");
        Circle circle = new Circle(5);
        Prism cylinder = new Prism(circle, 10);
        System.out.println("prism with a circle base");
        System.out.println("Prism volume = " + cylinder.volume());
        System.out.println("Prism surface area = " + cylinder.surfaceArea());
        System.out.println("--------------------");
        System.out.println();

        //Rectangular based prism test
        System.out.println("--------------------");
        Rectangular rectangular = new Rectangular(3, 4);
        Prism prismRectangular = new Prism(rectangular, 5);
        System.out.println("prism with a rectangular base");
        System.out.println("Prism volume = " + prismRectangular.volume());
        System.out.println("Prism surface area = " + prismRectangular.surfaceArea());
        System.out.println("--------------------");
        System.out.println();

        //Trapezoid with height based prism test
        System.out.println("--------------------");
        Trapezoid trapezoid = new Trapezoid(10, 20, 6, 12, 6);
        Prism prismTrapezoid = new Prism(trapezoid, 10);
        System.out.println("prism with a trapezoid base");
        System.out.println("Prism volume = " + prismTrapezoid.volume());
        System.out.println("Prism surface area = " + prismTrapezoid.surfaceArea());
        System.out.println("--------------------");
        System.out.println();

        //Triangle without height based prism test
        Triangle triangle = new Triangle(3, 4, 5);
        Prism prismTriangle = new Prism(triangle, 10);
        System.out.println("prism with a triangle base");
        System.out.println("Prism volume = " + prismTriangle.volume());
        System.out.println("Prism surface area = " + prismTriangle.surfaceArea());
        System.out.println();
    }
}
