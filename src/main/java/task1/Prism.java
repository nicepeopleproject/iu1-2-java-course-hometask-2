package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        return base.area()*h;
    }

    // площадь поверхности
    public double surfaceArea() {
        double area = 0;
        area += 2 * base.area();


        double[] parameters = base.getParameters();
        if(parameters.length == 1){
            area += h*2*Math.PI*parameters[0];

        }else{
            for(int i = 0; i<parameters.length; i++){
                area += h*parameters[i];
            }
        }

        return area;
    }
}
