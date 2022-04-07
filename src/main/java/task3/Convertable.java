package com.company;

interface Converter {
    static double convert(double a) {
        return 0;
    }
}

class Kelvin implements Converter{
    public static double convert(double celsium){
        return (celsium + 273.15);
    }
}

class Fahrenheit implements Converter{
    public static double convert(double celsium){
        return ((celsium*9)/5+32);
    }
}
