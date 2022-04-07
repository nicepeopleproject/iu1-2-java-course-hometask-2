package com.company;

public class Main {

    public static void main(String[] args) {
	    Triangle t = new Triangle(3,4,5 );
        Prism prizma = new Prism(t, 4);
        System.out.println(prizma.surfaceArea());
        System.out.println(prizma.volume());
    }
}
