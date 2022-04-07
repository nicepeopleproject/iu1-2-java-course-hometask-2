package task1;

public class Test {
    public static void main(String[] args) {

        System.out.println();

        // MARK: TEST - 1 : Circle
        System.out.println("------------ TEST - 1 : Circle -----------------");
        Circle circle = new Circle(15);
        Prism prismCircle = new Prism (circle, 20);
        System.out.println("Volume = " + prismCircle.volume());
        System.out.println("Surface area = " + prismCircle.surfaceArea());
        System.out.println("------------------------------------------------");
        System.out.println();

        // MARK: TEST - 2 : Rectangular
        System.out.println("------------ TEST - 2 : Rectangular -------------");
        Rectangular rectangular = new Rectangular(15, 20);
        Prism prismRectangular = new Prism (rectangular, 20);
        System.out.println("Volume = " + prismRectangular.volume());
        System.out.println("Surface area = " + prismRectangular.surfaceArea());
        System.out.println("------------------------------------------------");
        System.out.println();

        // MARK: TEST - 3 : Trapezoid
        System.out.println("------------ TEST - 3 : Trapezoid --------------");

        System.out.println("----------------- With weight ------------------");
        Trapezoid trapezoidWithWeight = new Trapezoid(15, 20, 10);
        Prism prismTrapezoidWithWeight = new Prism(trapezoidWithWeight, 20);
        System.out.println("Volume = " + prismTrapezoidWithWeight.volume());
        System.out.println("Surface area = " + prismTrapezoidWithWeight.surfaceArea());
        System.out.println("------------------------------------------------");

        System.out.println("---------------- Without weight ----------------");
        Trapezoid trapezoidWithoutWeight = new Trapezoid(15, 20, 10, 18);
        Prism prismTrapezoidWithoutWeight = new Prism(trapezoidWithWeight, 20);
        System.out.println("Volume = " + prismTrapezoidWithoutWeight.volume());
        System.out.println("Surface area = " + prismTrapezoidWithoutWeight.surfaceArea());
        System.out.println("------------------------------------------------");
        System.out.println();

        // MARK: TEST - 4 : Triangle
        System.out.println("------------ TEST - 4 : Triangle ---------------");

        System.out.println("----------------- With weight ------------------");
        Triangle triangleWithWeight = new Triangle(15, 12);
        Prism prismTriangleWithWeight = new Prism(triangleWithWeight, 20);
        System.out.println("Volume = " + prismTriangleWithWeight.volume());
        System.out.println("Surface area = " + prismTriangleWithWeight.surfaceArea());
        System.out.println("------------------------------------------------");

        System.out.println("---------------- Without weight ----------------");
        Triangle triangleWithoutWeight = new Triangle(15, 18, 20);
        Prism prismTriangleWithoutWeight = new Prism(triangleWithoutWeight, 20);
        System.out.println("Volume = " + prismTriangleWithoutWeight.volume());
        System.out.println("Surface area = " + prismTriangleWithoutWeight.surfaceArea());
        System.out.println("------------------------------------------------");
        System.out.println();
    }
}
