package com.project.person.enemy;

import com.project.MyCharacter;

public class Aku extends Enemy implements iEnemy {
    protected int attack = 35;
    protected int defence = 35;
    public Aku(String name,String enemyName){
        super(name,enemyName);
    }

    @Override
    public void Enemyplaying() {

        System.out.print("Aku creater");
    }
}
