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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHitPointLevel() {
        return hitPointLevel;
    }

    public void setHitPointLevel(int hitPointLevel) {
        this.hitPointLevel = hitPointLevel;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public MyCharacter getMyCharacter() {
        return myCharacter;
    }

    public void setMyCharacter(MyCharacter myCharacter) {
        this.myCharacter = myCharacter;
    }
}
