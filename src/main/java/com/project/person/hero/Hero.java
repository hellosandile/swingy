package com.project.person.hero;

public class Hero {
    public String name;
    public String heroName;
    public int level = 1;
    public int experience = 0;
    public int attack = 0;
    public int defence = 0;
    public int hitPointLevel = 100;
    public int hitPoint = 100;

    public Hero(String name, String heroName){
        this.name = name;
        this.heroName = heroName;
    }
}
