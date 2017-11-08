package com.company;

import java.util.Scanner;

public class Commands {

    Scanner scanner = new Scanner(System.in);
    String Animal = scanner.nextLine();


    public void chooseCharacter(Snake snake, Gorilla gorilla)
    {

        System.out.println("Choose your Animal: " + snake + "or " + gorilla + ": " + Animal);
        if (Animal.equals(snake))
        {
            System.out.println("Stats for your Animal:" + "\n" + "------------------------");
            snake.getStats();
        }
        else{
            System.out.println("Stats for your Animal:" + "\n" + "------------------------");
            gorilla.getStats();
        }

    }

}
