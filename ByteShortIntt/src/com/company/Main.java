package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte myByteVar = 127;
        short myShortVar = 12;
        int myIntVar = 2;
        long myConcatVar = 5000L + (10L*(myByteVar + myShortVar + myIntVar));
        System.out.println(myConcatVar);




    }
}
