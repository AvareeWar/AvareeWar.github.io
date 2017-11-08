package com.company;

public class Gorilla extends Animal
{

    public Gorilla(String Name, String Skin, String Teeth, int Hunger, int Speed, int Health) {
        super(Name, Teeth, Skin, Speed, 500);
    }

    public void run(){
        if (checkAlive(this.Hunger)) {
            System.out.println("The Gorilla runs");
            this.DecreaseHunger(20, "Gorilla");
        }
    }

    public void roar(Animal victim){
        if (checkAlive(this.Hunger)){
            System.out.println("The Gorilla roars");
            this.DecreaseHunger(10, "Gorilla");
            this.GiveDamage(10, victim);
        }
    }

    public void toss(int attack, Animal victim){
        if(checkAlive(this.Hunger)){
            System.out.println("The Gorilla tosses it's opponent");
            this.DecreaseHunger(20, "Snake");
            this.GiveDamage(50, victim);
        }
    }

    public void pound(Animal Victim){
        if(checkAlive(this.Hunger)){
            System.out.println("The gorilla pounds on his opponent");
            this.DecreaseHunger(40,"Gorilla");
            this.GiveDamage(200, Victim);
        }
    }
}
