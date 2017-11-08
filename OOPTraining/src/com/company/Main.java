package com.company;

import com.sun.prism.GraphicsResource;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Commands commandCenter = new Commands();

        Snake Scales = new Snake("Sparky", "Scales", "Fangs", 100, 250, 500);
        Gorilla Grrr = new Gorilla("Grrr", "Fur", "Chompers", 100, 150, 500);



        commandCenter.chooseCharacter(Scales, Grrr);






    }



}
