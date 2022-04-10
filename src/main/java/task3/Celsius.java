package task3;

class Celsius implements Converter {
    static double convert(double degree, String dimension) throws Exception {
        switch (dimension){
            case "C": {
                return degree;
            }
            case "F": {
                return degree * 1.8 + 32;
            }
            case "K": {
                return degree + 273.15;
            }
            default: {
                throw new Exception("Error: wrong option");
            }
        }
    }
}