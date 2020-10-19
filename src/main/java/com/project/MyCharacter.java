package com.project;

public class MyCharacter{

    // Variables . Attributes all charcters have
    public String name;
    public int Level;
    public int Experience;
    public int Attack;
    public int Defense;
    public int Power;
    public int Hp;


    public MyCharacter(){}
    //Constructor for MyCharacter
    public MyCharacter(int Level, int Experience, int Attack, int Defense, int hp){
        this.Level = Level;
        this.Experience = Experience;
        this.Attack = Attack;
        this.Defense = Defense;
        this.Power = Attack + Defense;
        this.Hp = hp;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

}
