package com.project.person.enemy;

import com.project.person.enemy.*;
import com.project.*;


public class EnemyType{

        System.out.println("Enemy created");
        
        if(_enemyname.equals("Aku")){
            return new Aku( name, _enemyname, myCharacter);
        }else{
            return null;
        }
    }
}