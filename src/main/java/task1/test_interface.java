package task1;

public class test_interface {
    public static void main(String[] args) {

        Figure2D Figure = new Triangle(3, 4, 5);
        Prism P1 = new Prism(Figure, 5);
        System.out.println(P1.volume());
        System.out.println(P1.surfaceArea());

        Figure2D Figure2 = new Circle(4);
        Prism P2 = new Prism(Figure2, 5);
        System.out.println(P2.volume());
        System.out.println(P2.surfaceArea());

        Figure2D Figure3 = new Rectangular(2, 3);
        Prism P3 = new Prism(Figure3, 5);
        System.out.println(P3.volume());
        System.out.println(P3.surfaceArea());

        Figure2D Figure4 = new Trapezoid(3, 6, 2, 2);
        Prism P4 = new Prism(Figure4, 5);
        System.out.println(P4.volume());
        System.out.println(P4.surfaceArea());
    }
}
