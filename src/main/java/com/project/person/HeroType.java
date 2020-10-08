package com.project;

import com.project.person.hero.Animaniac;
import com.project.person.hero.Hero;
import com.project.person.hero.iHero;

public class HeroType{
    public static iHero newType(String name,String _heroname){

        if(_heroname.equals("Animaniac")){
            return new Animaniac( name, _heroname);
        }else{
            return null;
        }
    }
}