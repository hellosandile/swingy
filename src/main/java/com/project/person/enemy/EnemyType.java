package com.project.person.enemy;

public class EnemyType{
    public static iEnemy enemyType(String name,int hitPoint, int attack, int defence){

        System.out.println("Enemy created");
        
        if(name.equals("Aku")){
            return new Aku( name, hitPoint, attack, defence);
        }else{
            return null;
        }
    }
}