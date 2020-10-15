package com.project.person.enemy;

import com.project.person.enemy.*;
import com.project.*;


public class EnemyType{
    public static iEnemy newType(String name,String _enemyname, int Level, int Experience, int Attack, int Defense, int hp){

        MyCharacter myCharacter = new MyCharacter(Level, Experience, Attack, Defense, hp);

        if(_enemyname.equals("Aku")){
            return new Aku( name, _enemyname, myCharacter);
        }else{
            return null;
        }
    }
}