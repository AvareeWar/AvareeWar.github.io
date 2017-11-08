package com.company;


import java.util.Random;

public class Animal
{
    String Name;
    String Skin;
    String Teeth;
    int Hunger;
    int Speed;
    int Health;


    public Animal(String Name, String Skin, String Teeth, int Speed, int Health){
        this.Name = Name;
        this.Skin = Skin;
        this.Teeth = Teeth;
        this.Hunger = 100;
        this.Speed = Speed;
        this.Health = Health;


    }


    public boolean checkAlive(int Hunger){
        if(this.Hunger <= 0){
            System.out.println("You cannot perform this function for you have died and your corpse is rotting away");
            return false;
        }
        return true;
    }


    public void DecreaseHunger(int Hungercost, String animal){
        this.Hunger -= Hungercost;
        if (Hungercost <= 0){
            System.out.println("The" + animal +  "has died");
        }
    }


    public void GiveDamage(int attack, Animal Victim){
        Victim.Health -= attack;
        if(Victim.Health <= 0){
            System.out.println("The" + Victim.Name + "has died");
        }
        System.out.println("The Victim has " + Victim.Health + " left");
    }

    public void Dodge(Animal Victim)
    {
        Random Rgenerator = new Random();
        for (int i = 0; i < 100; i++){
            int randomInt = Rgenerator.nextInt(100);
        }
    }

   /* public void whoGoesFirst(Animal Fighter){
        this.Speed = Speed;
        Random rgenerator = new Random();
        int randint = rgenerator.nextInt(10);
        if (Fighter.Speed > this.Speed){
            System.out.println(Fighter.Name + " goes first");
        }
        else if(Fighter.Speed < this.Speed){
            System.out.println(this.Name + " goes first");
        }
        else{
            if(randint < 5 )
            {

            }
        }
    }*/

    public void getStats(){
        this.Health = Health;
        this.Hunger = Hunger;
        this.Speed = Speed;
        System.out.println("STATS:" + "\n" + "Health: " + Health + "\n" + "Hunger: " + Hunger +
        "\n" + "Speed: " + Speed);
    }




}


