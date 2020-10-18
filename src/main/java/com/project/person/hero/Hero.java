package com.project.person.hero;

import java.util.concurrent.ThreadLocalRandom;

import com.project.MyCharacter;
import com.project.person.enemy.Enemy;

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

    public void attack(Enemy enemy)
    {
        int randV = ThreadLocalRandom.current().nextInt(0,10);
        if (this.getAttack() > enemy.getDefence())
        {
            enemy.setHitPoint(enemy.hitPoint - (this.attack - enemy.getDefence()));
        }
        else
            if (randV <= 2)
            {
                enemy.setHitPoint(enemy.hitPoint - this.attack);
            }
    }

    public boolean fight(Enemy enemy)
    {
        int enemy_points = enemy.getHitPoint();
        int hero_points  = this.getHitPoint();
        while(enemy_points > 0 && hero_points > 0)
        {
            this.attack(enemy);
            enemy.attack(this);
            enemy_points = enemy.getHitPoint();
            hero_points  = this.getHitPoint();
        }
        return (hero_points > 0) ? true : false;
    }

    public int Result(Enemy enemy)
    {
        int xp = enemy.getAttack() + enemy.getDefence() + enemy.getHitPoint();
        int rand = ThreadLocalRandom.current().nextInt(0, 40);

        if (rand < 20) {
            return xp;
        }

        return fight(enemy) ? xp : -1;
    }

    public void increaseLevel()
    {
        this.attack = this.attack + (level * 6);
        this.defence = this.defence + (level * 5);
        this.setLevel(level + 1);
        this.hitPoint = this.hitPoint + (level * 450);
    }

    public void increaseExp(int gainedExp)
    {
        int nextLevel = (this.getLevel() + 1) * 1000 + this.getLevel() * this.getLevel() * 450;
        int sum = this.experience + gainedExp;
        if(sum >= nextLevel)
        {
            this.increaseLevel();
        }
        this.setExperience(experience + gainedExp);
    }

    // public void run()
    // {
    //     if (new Random().nextBoolean()) 
    //     {
    //         this.field.printMessage("moved to previous position!");
    //         game.getCoordinates().setXCoord(coordinates.getXCoord());
    //         game.getCoordinates().setYCoord(coordinates.getYCoord());
    //     } 
    //     else 
    //     {
    //         this.field.printMessage("You fought");
    //         onAttack();
    //     }
    // }
}
