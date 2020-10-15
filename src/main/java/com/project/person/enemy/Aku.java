package com.project.person.enemy;

import com.project.MyCharacter;

public class Aku extends Enemy implements iEnemy {
    protected int attack = 35;
    protected int defence = 35;
    public Aku(String name,String enemyName, MyCharacter myCharacter){
        super(name,enemyName,myCharacter);
    }

    @Override
    public void Enemyplaying() {

        System.out.print("Aku creater");
    }
}
