package Tests;

import task3.Fahrenheit;
import task3.Kelvin;
import task3.Newton;
import task3.Rankine;
import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wish = 1;
        while (wish == 1) {
            System.out.print("Введите температуру в градусах Цельсия для перевода: ");
            double temp = sc.nextDouble();
            Kelvin K = new Kelvin();
            K.convert(temp);
            Fahrenheit F = new Fahrenheit();
            F.convert(temp);
            Rankine R = new Rankine();
            R.convert(temp);
            Newton N = new Newton();
            N.convert(temp);
            System.out.println("Хотите продолжить?");
            System.out.println("1. Да     2. Нет");
            wish = sc.nextInt();
            System.out.println("------------------------------");
        }
    }
}
