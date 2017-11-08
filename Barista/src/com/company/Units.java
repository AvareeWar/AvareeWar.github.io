package com.company;

import sun.awt.SunHints;

public class Units {

    Inventory inventory = new Inventory();
    double value;
    int quantity;
    String Name;
    Ingredients[] ingredients;



    //Per unit of Coffee, decaf, etc, it takes a certain amount of ingredients
    //also consider the concatenation between each ingredient to create the product


    public void Value(double value, int quantity, String Name, Ingredients[] ingredients){
        //autonomous function to create pricing
        this.quantity = quantity;
        this.Name = Name;
        this.ingredients = ingredients;

        for (int i = 0; i < ingredients.length; i++){
            this.value += ingredients[i].value * ingredients[i].quantity;
        }
    }

}
