package com.company;

public class Snake extends Animal
{

    public Snake(String Name, String Skin, String Teeth, int Hunger, int Speed, int Health) {
        super(Name, Teeth, Skin, Speed, 500);
    }

    public void Slither(){
        if (checkAlive(this.Hunger)) {
            System.out.println("The snake slithers");
            this.DecreaseHunger(10, "Snake");
        }
    }

    public void Bite(Animal victim){
        if (checkAlive(this.Hunger)){
            System.out.println("The snake bites");
            this.DecreaseHunger(20, "Snake");
            this.GiveDamage(20, victim);
        }
    }

    public void Strangle(int attack, Animal victim){
        if(checkAlive(this.Hunger)){
            System.out.println("The snake strangles");
            this.DecreaseHunger(30, "Snake");
            this.GiveDamage(50, victim);
        }
    }

    public void VenomSquirt(Animal Victim){
        if(checkAlive(this.Hunger)){
            System.out.println("The snake squirts venom");
            this.DecreaseHunger(10,"Snake");
            this.GiveDamage(10, Victim);
        }
    }













}
