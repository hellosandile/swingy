package com.project;

public class Player extends Character {

    //intergers to store number of upgrades/skills in each path
    public int numberAttackUpgrades, numberDefensiveUpgrades;

    //Arrays to store skill names
    public String[] attackUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    private String[] defenseUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};

    //Player specific constructor
    public Player(String name) {
        super(name, 100, 0);
        this.numberAttackUpgrades = 0;
        this.numberDefensiveUpgrades = 0;
        //let the player choose a trait when creating a new character
        chooseTrait();
    }

    @Override
    public int attack(){
        //TODO Auto-generate method stub
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }


    //let the player choose a trait fo either skill path
    public void chooseTrait(){
        GameLogic.clearConsole();
        System.out.println("Choose a trait: ");
        System.out.println("(1) " + attackUpgrades[numberAttackUpgrades]);
        System.out.println(("(2)" + defenseUpgrades[numberDefensiveUpgrades]));
        //get the players choice:
        int input = GameLogic.readInt("->", 2);
        GameLogic.clearConsole();
        //deal with both cases
        if(input == 1){
            System.out.println("You chose " + attackUpgrades[numberAttackUpgrades]);
            numberAttackUpgrades++;
        }else{
            System.out.println("You chose " + defenseUpgrades[numberDefensiveUpgrades]);
            numberDefensiveUpgrades++;
        }
        GameLogic.anythingToContinue();
    }
}
