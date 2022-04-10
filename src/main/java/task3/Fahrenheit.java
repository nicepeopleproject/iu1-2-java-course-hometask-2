package task3;

class Fahrenheit implements Converter {
    static double convert(double degree, String dimension) throws Exception {
        switch (dimension){
            case "F": {
                return degree;
            }
            case "C": {
                return (degree - 32) / 1.8;
            }
            case "K": {
                return (degree + 459.67) / 1.8;
            }
            default: {
                throw new Exception("Error: wrong option");
            }
        }
    }
}