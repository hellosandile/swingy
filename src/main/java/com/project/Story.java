package com.project;

//All this class does is story methods to print out every part of the story
public class Story {

    public static void clearConsole(){
        for(int i = 0; i < 4; i++)
            System.out.println();
    }

    public static void printDirectionToTake(){
        clearConsole();
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
        GameLogic.anythingToContinue();
    }

    public static void printGameIntro(){
        System.out.println("Welcome to Swingy\n---------------------\nLet us get you started");
    }

    public static void printGameEnding(){
        clearConsole();
        System.out.print(
                                "******************************************************************************\n" +
                                "*                                     THE END                                *\n" +
                                "*                                                                            *\n" +
                                "*                WELL    DONE     YOU     FINISHED    THE    GAME            *\n" +
                                "*                                                                            *\n" +
                                "*                                                                            *\n" +
                                "*                                                                            *\n" +
                                "******************************************************************************\n"

                );

    }
}
