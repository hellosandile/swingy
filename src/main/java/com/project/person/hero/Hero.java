package com.project.person.hero;

import com.project.MyCharacter;

public class Hero {
    public String name;
    public String heroName;
    public int level = 1;
    public int experience = 0;
    public int attack = 0;
    public int defence = 0;
    public int hitPointLevel = 100;
    public int hitPoint = 100;
    protected MyCharacter myCharacter;

    public Hero(String name, String heroName, MyCharacter myCharacter){
        this.name = name;
        this.heroName = heroName;
        this.myCharacter = myCharacter;
    }
}
