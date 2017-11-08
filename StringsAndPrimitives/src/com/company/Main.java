package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //recap
            //byte
            //short
            //int
            //long
            //float
            //double
            //char
            //boolean

        String myString = "This is a String";
        myString = myString + ", and this is more";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);//this concatenates the strings, not the numbers

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

        //String is not a primitive type, in fact it is called a class


    }
}
