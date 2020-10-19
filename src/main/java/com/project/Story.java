package com.project;

//All this class does is story methods to print out every part of the story
public class Story {

    public static void printDirectionToTake(){
        GameLogic.clearConsole();
        System.out.println("Which direction would you like to go?");
        System.out.println("(1) North");
        System.out.println("(2) East");
        System.out.println("(3) South");
        System.out.println("(4) West");
        GameLogic.anythingToContinue();
    }

    public static void printFightOrRun(){
        System.out.println("You encounted an enemy. What do you want to do?");
        System.out.println("(1) Fight");
        System.out.println("(2) Run for the hills");
    }

    public static void printChooseHero(){
        System.out.println("Choose your Hero young Padawon");
        System.out.println("(1) Flinstone");
        System.out.println("(2) PowerPuff");
        System.out.println("(3) Animaniac");
        GameLogic.anythingToContinue();
    }

    public static void printYouWon(){
        System.out.println("YEAH!! You beat the enemy");
        System.out.println("This is who you defeated");
        //print enemy and stats
        GameLogic.anythingToContinue();
    }

    public static void printGameIntro(){
        System.out.println("Welcome to Swingy\n---------------------\nLet us get you started");
    }
}

// You won(1 Gain ep based on villian power, 2 Gain an aritifact which can keep or leave which vary) - You lost(You died and lost the mission) - You ran away with not damage - You couldn't get away(you got puched and lost blah and position) -