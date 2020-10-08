package com.project.person.hero;

import com.project.GameLogic;

public class Animaniac extends Hero implements iHero {
    private int attack = 1000;
    private int defence = 1000;
    
    public Animaniac(String name,String _heroname){
        super(name,_heroname);
    }

    @Override
    public void playing() {
        this.attack = attack;
        this.defence = defence;
        System.out.println("Animaniac Fetures");
        System.out.println("Name "+this.name);
        System.out.println("Type "+this.heroName);
        System.out.println("attect "+this.attack);
        System.out.println("defense "+this.defence);
        


    }
}
