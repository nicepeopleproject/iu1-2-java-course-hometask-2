package task1;

public class PrismTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3,3);
        Circle circle = new Circle(12);
        System.out.println(circle.area());

        Prism prism = new Prism(circle, 12);
        System.out.println(prism.volume());
        System.out.println(prism.surfaceArea());
    }
}
