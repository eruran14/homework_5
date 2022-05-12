package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Boss b1 = new Boss();
    b1.setHealth(1000);
    b1.setDamage(150);
    b1.setDefenceType("Magical");
        System.out.println(b1.getHealth() + " " + b1.getDamage() + " " + b1.getDefenceType());
    createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " "
                    + createHeroes()[i].getSuperpower());
        }
    }

    public static Hero[] createHeroes(){
        Hero h1 = new Hero(450, 50);
        Hero h2 = new Hero(350, 35, "Telekinesis");
        Hero h3 = new Hero(300, 40, "Invisibility");
        Hero[] createdHeroes = {h1, h2, h3};
        return createdHeroes;
    }
}
