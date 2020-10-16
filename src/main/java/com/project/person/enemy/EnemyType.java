package com.project.person.enemy;

import com.project.person.enemy.*;
import com.project.*;


public class EnemyType{
    public static iEnemy enemyType(String name,String _enemyname){

        System.out.println("Enemy created");
        
        if(_enemyname.equals("Aku")){
            return new Aku( name, _enemyname);
        }else{
            return null;
        }
    }
}