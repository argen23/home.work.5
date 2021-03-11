package com.argen;

public class Main {
    public Hero[] createHeroes() {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        Hero hero3 = new Hero();

        Hero hero4 = new Hero(5, 100);

        hero1.getHerohealth(900);
        hero1.getHerodamage(60);
        hero1.getHerosuperDamage(80);
        hero2.getHerohealth(850);
        hero2.getHerodamage(65);
        hero2.getHerosuperDamage(90);
        hero3.getHerodamage(70);
        hero3.getHerohealth(800);
        hero3.getHerosuperDamage(100);
        Hero allHeroes[] = new Hero[]{hero1, hero2, hero3, hero4};
        return allHeroes;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Hero hero[] = main.createHeroes();
        for (int i = 0; i < main.createHeroes().length; i++) {
            System.out.println("Hero health : "+hero[i].getHerohealth() + " Hero damage : " + hero[i].getHerodamage() + " Hero super damage : " + hero[i].getHerosuperDamage());
        }

    }

}

