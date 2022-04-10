package task1;

public class Trapezoid extends Figure2D {
    private int a,b,c,d;

    public Trapezoid(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c=c;
        this.d=d;
        this.lengthOfFigure=(a+b+c+d);
    }

    @Override
    double area() {
        return 0.5*(this.a+this.b)*Math.sqrt(c*c-Math.pow((((b-a)*(b-a)+c*c-d*d)/(2*(b-a))),2));
    }
}
