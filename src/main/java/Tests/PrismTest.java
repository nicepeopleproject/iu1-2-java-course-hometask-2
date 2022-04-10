package Tests;

import task1.*;

public class PrismTest {
    public static void main(String[] args) {
        Prism prism1 = new Prism(new Circle(10), 10);
        System.out.println("Призма 1. Основание окружность. Объём = " + prism1.volume() + " Площадь поверхности = " + prism1.surfaceArea());
        Prism prism2 = new Prism(new Rectangular(2, 7), 10);
        System.out.println("Призма 2. Основание прямоугольник. Объём = " + prism2.volume() + " Площадь поверхности = " + prism1.surfaceArea());
        Prism prism3 = new Prism(new Trapezoid(8, 4, 2),10);
        System.out.println("Призма 3. Основание трапеция. Объём = " + prism3.volume() + " Площадь поверхности = " + prism1.surfaceArea());
        Prism prism4 = new Prism(new Triangle(3, 4, 5), 10);
        System.out.println("Призма 4. Основание треугольник. Объём = " + prism4.volume() + " Площадь поверхности = " + prism1.surfaceArea());
    }
}
