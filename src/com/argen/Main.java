package com.argen;

public class Main {

    public static void main(String[] args) {
        Boss boss = new  Boss();
        boss.setBossHealth(800);
        boss.setBossdamage(50);
        boss.setBossDefenceType("Magic");
        System.out.println();
        System.out.println("Boss Healed:" + boss.getBossHealth() + "HP:"+ boss.getBossdamage() + "boss defence type" +
                boss.getBossDefenceType());
        System.out.println("______________");

        }


    }

