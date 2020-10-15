package com.project.person.enemy;

import com.project.MyCharacter;

public class Enemy {
    public int hitPoint = 100;
    public int attack;
    public int defence;
    public String name;
    public String enemyName;
    public MyCharacter myCharacter;

    public Enemy(String name, String enemyName, MyCharacter myCharacter){
        this.name = name;
        this.enemyName = enemyName;
        this.myCharacter = myCharacter;
    }
    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
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

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public MyCharacter getMyCharacter() {
        return myCharacter;
    }

    public void setMyCharacter(MyCharacter myCharacter) {
        this.myCharacter = myCharacter;
    }

}
