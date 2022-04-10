package task1;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=1;
        int figure=1;
        while(i!=0){
            System.out.println("Основание призмы:\t\n1.Прямоугольник\t\n2.Трапеция\t\n3.Треугольник\t\n4.Круг");
            figure=scan.nextInt();
            switch (figure){
                case 1:
                    System.out.println("Введите длину: ");
                    int length = ImputNum();
                    System.out.println("Введите ширину: ");
                    int width = ImputNum();
                    Figure2D rect= new Rectangular(length,width);
                    Prism newPrizmRect=PrismAdd(rect);
                    Print(newPrizmRect);
                    break;
                case 2:
                    System.out.println("Введите первое основание: ");
                    int a1 = ImputNum();
                    System.out.println("Введите второе основание: ");
                    int b1 = ImputNum();
                    System.out.println("Введите первую боковую сторону: ");
                    int c1 = ImputNum();
                    System.out.println("Введите вторую боковую сторону: ");
                    int d1 = ImputNum();
                    Figure2D trap= new Trapezoid(a1,b1,c1,d1);
                    Prism newPrizmTrap=PrismAdd(trap);
                    Print(newPrizmTrap);
                    break;
                case 3:
                    System.out.println("Введите первую сторону: ");
                    int a = ImputNum();
                    System.out.println("Введите вторую сторону: ");
                    int b = ImputNum();
                    System.out.println("Введите третью сторону: ");
                    int c = ImputNum();
                    Figure2D triang= new Triangle(a,b,c);
                    Prism newPrizmTriangle=PrismAdd(triang);
                    Print(newPrizmTriangle);
                    break;
                case 4:
                    System.out.println("Введите радиус: ");
                    int r = ImputNum();
                    Figure2D circle= new Circle(r);
                    Prism newPrizmCircle=PrismAdd(circle);
                    Print(newPrizmCircle);
                    break;
                default:
                    System.out.println("Ошибка");
                    break;
            }





            System.out.println("Введите:\n\t1.Продолжить\n\t0.Выход");
            i=scan.nextInt();
        }
    }
    public static int heightOfPrizm(){
        System.out.println("Введите Высоту призмы: ");
        int h=ImputNum();
        return h;
    }
    public static int ImputNum(){
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        boolean isPositive=false;
        while (!isPositive) {
            if(a>0){
                isPositive=true;
            }else{
                System.out.println("Отрицательное число\tВедите положительное число:");
                a = scan.nextInt();
            }
        }
        return a;
    }

    public static Prism PrismAdd(Figure2D f){
        int heightOfPrizm=heightOfPrizm();
        Prism newPrizm=new Prism(f,heightOfPrizm);
        return newPrizm;
    }

    public static void Print(Prism prism){
        Scanner scan=new Scanner(System.in);
        int i=1;
        while (i>0){
            System.out.println("Введите:\n\t1.Найти объем\n\t2.Найти площадь поверхности\n\t0.Выход");
            i=scan.nextInt();
            switch (i){
                case 1:
                    System.out.println("Объем = "+prism.volume());
                    break;
                case 2:
                    System.out.println("Площадь поверхности = "+prism.surfaceArea());
                case 0:
                    break;
                default:
                    System.out.println("Ошибка");
                    i=1;
                    break;
            }
        }
    }
}
