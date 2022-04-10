package task1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangular rectangular = new Rectangular(10,15);
        Trapezoid trapezoid = new Trapezoid(2,5,2.5,2.5);
        Triangle triangle = new Triangle(2,3,4);

        System.out.println(circle.area());
        System.out.println(rectangular.area());
        System.out.println(trapezoid.area());
        System.out.println(triangle.area());
        System.out.println();

        Prism prism1 = new Prism(circle, 10);
        Prism prism2 = new Prism(rectangular, 10);
        Prism prism3 = new Prism(trapezoid, 10);
        Prism prism4 = new Prism(triangle, 10);

        System.out.println(prism1.vol());
        System.out.println(prism2.vol());
        System.out.println(prism3.vol());
        System.out.println(prism4.vol());
        System.out.println();
        System.out.println(prism1.surfArea());
        System.out.println(prism2.surfArea());
        System.out.println(prism3.surfArea());
        System.out.println(prism4.surfArea());
    }
}