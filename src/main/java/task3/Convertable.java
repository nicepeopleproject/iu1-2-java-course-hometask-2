package task3;

import java.util.Objects;

interface Convertable {
    static double convert(double degree, String dimension) { return 0; }
}

class Kelvin implements Convertable {
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
                throw new Exception("This conversion is not possible");
            }
        }
    }
}


class Fahrenheit implements Convertable {
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
                throw new Exception("This conversion is not possible");
            }
        }
    }
}


class Celsius implements Convertable {
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
                throw new Exception("This conversion is not possible");
            }
        }
    }
}
