package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5/3;
	    float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntVlaue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        //-------------------------------
        double myamountofLB = 200d;
        double myconvertedLBtoKB = .45359237d * myamountofLB;
        System.out.println("My Conversion:  " + myconvertedLBtoKB);


    }
}
