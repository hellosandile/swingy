package com.project.person.enemy;

import java.util.concurrent.ThreadLocalRandom;

import com.project.MyCharacter;
import com.project.person.hero.Hero;

public class Enemy {
    public int hitPoint;
    public int attack;
    public int defence;
    public String name;

    public Enemy(String name, int hitPoint, int attack, int defence) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.defence = defence;
    }

    public Enemy(String name2, String enemyName) {
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getHitPoint() {
        return hitPoint;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Hero hero)
    {
        int randV = ThreadLocalRandom.current().nextInt(0,10);
        if (this.getAttack() > hero.getDefence())
        {
            hero.setHitPoint(hero.hitPoint - (this.attack - hero.getDefence()));
        }
        else
            if (randV <= 2)
            {
                hero.setHitPoint(hero.hitPoint - this.attack);
            }
    }

}
