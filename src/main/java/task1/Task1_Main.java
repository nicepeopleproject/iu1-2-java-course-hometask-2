package task1;


public class Task1_Main {
    public static void main(String[] args) {

        System.out.println("_____________Test1____________");
        System.out.println("Основание - прямоугольник\n длина 50\n ширина 25\n высота 20");
        Figure2D rect = new Rectangular(50, 25);
        Prism newPrizmRect = new Prism(rect, 20);
        System.out.println("Объем = " + newPrizmRect.volume());
        System.out.println("Площадь поверхности = " + newPrizmRect.surfaceArea());

        System.out.println("_____________Test2____________");
        System.out.println("Основание - Трапеция\n первое основание: 50\n второе основание: 25\n первая боковая сторона: 15\n вторая боковая сторона: 15\n высота 20");
        Figure2D trap = new Trapezoid(50, 25, 15, 15);
        Prism newPrizmTrap = new Prism(trap, 20);
        System.out.println("Объем = " + newPrizmTrap.volume());
        System.out.println("Площадь поверхности = " + newPrizmTrap.surfaceArea());

        System.out.println("_____________Test3____________");
        System.out.println("Основание - Треугольник\n первая сторона 50\n вторая сторона 40\n третья сторона 30\n высота 20");
        Figure2D triang = new Triangle(50, 40, 30);
        Prism newPrizmTriangle = new Prism(triang, 20);
        System.out.println("Объем = " + newPrizmTriangle.volume());
        System.out.println("Площадь поверхности = " + newPrizmTriangle.surfaceArea());

        System.out.println("_____________Test4____________");
        System.out.println("Основание - окружность\n радиус 25\n высота 20");
        Figure2D circle = new Circle(25);
        Prism newPrizmCircle = new Prism(circle, 20);
        System.out.println("Объем = " + newPrizmCircle.volume());
        System.out.println("Площадь поверхности = " + newPrizmCircle.surfaceArea());
    }
}
