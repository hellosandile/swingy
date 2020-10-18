package com.project.person;

import com.project.person.hero.Animaniac;
import com.project.person.hero.Hero;
import com.project.person.hero.iHero;
import com.project.MyCharacter;

public class HeroType{
    public static iHero newType(String name,String _heroname, int Level, int Experience, int Attack, int Defense, int hp){

        MyCharacter myCharacter = new MyCharacter(Level, Experience, Attack, Defense, hp);

        if(_heroname.equals("Animaniac")){
            return new Animaniac( name, _heroname, myCharacter);
        }else{
            return null;
        }
    }
}