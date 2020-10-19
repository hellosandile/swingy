package com.project.person.enemy;

import com.project.MyCharacter;

public class Aku extends Enemy implements iEnemy {
    // protected int attack;
    // protected int defence;
    protected static int xp;
    protected static int yp;

    public Aku(String name,int hitPoint, int attack, int defence){
        super(name, hitPoint, attack, defence);
    }

    @Override
    public void Enemyplaying() {

        System.out.println("Aku creater");
    }

    @Override
    public Aku getAku() {

       return this;
    }

    public void AkuCharacter(){
        
    }
    public int getEnemyX() {
        return yp;
    }

    public int getEnemyY() {
        return xp;
    }
    public void setEnemyPosition(int X, int Y) {
        xp = X;
        yp = Y;
    }

    public static int getX()
    {
        return xp;
    }

    public static int getY()
    {
        return yp;
    }

    public static void setX(int X)
    {
        xp = X;
    }

    public static void setY(int Y)
    {
        yp = Y;
    }
}
