package com.project;

public abstract class Character{

    // Variables . Attributes all charcters have
    public String name;
    public int maxHitPoint, hitPoints, experiencePoints;

    //Constructor for character
    public Character(String name, int maxHitPoint, int experiencePoints){
        this.name = name;
        this.maxHitPoint = maxHitPoint;
        this.experiencePoints = experiencePoints;
        this.hitPoints = maxHitPoint;
    }

    //methods every character has
    public abstract int attack();
    public abstract int defend();
}
