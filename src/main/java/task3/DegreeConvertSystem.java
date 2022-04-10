package task3;

class DegreeConvertSystem implements Converter {
    static double convert(double degreesCount, String descriptorFrom, String descriptorTo) {
        switch (descriptorFrom) {
            case "C": {
                switch (descriptorTo) {
                    case "C": { return degreesCount; }
                    case "F": { return ((degreesCount * 9) / 5.0) + 32; }
                    case "K": { return degreesCount + 273.15; }
                    //default: { throw  new Exception("Invalid input data. Try again."); }
                }
            }

            case "F": {
                switch (descriptorTo) {
                    case "C": { return ((degreesCount - 32) * 5) / 9.0; }
                    case "F": { return degreesCount; }
                    case "K": { return ((degreesCount + 459.67) * 5) / 9.0; }
                    //default: { throw  new Exception("Invalid input data. Try again."); }
                }
            }

            case "K": {
                switch (descriptorTo) {
                    case "C": { return degreesCount - 273.15; }
                    case "F": { return 1.8 * (degreesCount - 273.15) + 32; }
                    case "K": { return degreesCount; }
                    //default: { throw  new Exception("Invalid input data. Try again."); }
                }
            }
            default: { return -1; }
        }
    }
}
