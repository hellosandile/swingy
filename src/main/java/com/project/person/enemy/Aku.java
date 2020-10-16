package com.project.person.enemy;

import com.project.MyCharacter;

public class Aku extends Enemy implements iEnemy {
    protected int attack = 35;
    protected int defence = 35;
    protected int xp;
    protected int yp;

    public Aku(String name,String enemyName){
        super(name,enemyName);
    }

    @Override
    public void Enemyplaying() {

        System.out.println("Aku creater");
    }
    public void AkuCharacter(){
        
    }
    public int getEnemyX() {
        return this.yp;
    }

    public int getEnemyY() {
        return this.xp;
    }
    public void setEnemyPosition(int X, int Y) {
        this.xp = X;
        this.yp = Y;
    }
}
