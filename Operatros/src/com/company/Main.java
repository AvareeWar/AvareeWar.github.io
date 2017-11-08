package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + "- 1: " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "* 10 =" + result);
        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + "/ 5" + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        result++;
        System.out.println(result);
        result += 1;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result -= 10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);


        boolean isAlien = false;

        if (isAlien == false){
            System.out.println("It is not an Alien");

            int topScore = 80;
            if (topScore < 100){
                System.out.println("You got the top score!");

                int secondtopscore = 60;
                if (topScore > secondtopscore && topScore < 100){
                    System.out.println("Greater than top score and less then 100");
                }
            }
        }



    }
}
