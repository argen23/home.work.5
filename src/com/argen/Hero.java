package com.argen;

public class Hero {
    private int Herohealth;
    private int Herodamage;
    private int HerosuperDamage;

    public Hero() {
        super();

    }
    public Hero(int damage, int health){
        this.Herodamage = damage;
        this.Herohealth = health;
        this.HerosuperDamage = 0;
    }


    public int getHerohealth() {
        return Herohealth;
    }

    public void getHerohealth(int herohealth) {
        Herohealth = herohealth;
    }

    public int getHerosuperDamage() {
        return HerosuperDamage;
    }

    public void getHerosuperDamage(int herosuperDamage) {
        HerosuperDamage = herosuperDamage;
    }

    public int getHerodamage() {
        return Herodamage;
    }

    public void getHerodamage(int herodamage) {
        Herodamage = herodamage;
    }

}

