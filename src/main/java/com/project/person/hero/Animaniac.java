package com.project.person.hero;


import com.project.GameLogic;
import com.project.MyCharacter;

public class Animaniac extends Hero implements iHero {
    private int attack = 1000;
    private int defence = 1000;
    
    public Animaniac(String name,String _heroname, MyCharacter myCharacter){
        super(name,_heroname,myCharacter);
    }
    
    //@Override
    public void playing() {
        System.out.println("Animaniac Fetures");
        System.out.println("Name "+this.name);
        System.out.println("Type "+this.heroName);
        System.out.println("attack "+this.myCharacter.Attack);
        System.out.println("defense "+ this.myCharacter.Defense);
        System.out.println(("Level "+ this.myCharacter.Level));

    }

}
