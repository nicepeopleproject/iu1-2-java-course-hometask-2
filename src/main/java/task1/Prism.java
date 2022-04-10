package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    public double vol() {
        return base.area()*h;
    }

    public double surfArea() {
        double area = 2 * base.area();

        if(base.getPar().length == 1){
            area += h*2*Math.PI*base.getPar()[0];

        }else{
            for(int i = 0; i<base.getPar().length; i++){
                area += h*base.getPar()[i];
            }
        }

        return area;
    }
}