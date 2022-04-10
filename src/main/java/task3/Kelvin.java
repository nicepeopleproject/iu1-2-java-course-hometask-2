package task3;

class Kelvin implements Converter {
    static double convert(double degree, String dimension) throws Exception {
        switch (dimension){
            case "K": {
                return degree;
            }
            case "C": {
                return degree - 273.15;
            }
            case "F": {
                return degree * 1.8 - 459.67;
            }
            default: {
                throw new Exception("Error: wrong option");
            }
        }
    }
}