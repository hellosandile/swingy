package com.project;

import java.util.Scanner;

public class GameLogic{
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning ;

    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer!!!");
            }
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                System.out.println("Please enter number less than 4");
            }

        }while(input < 1 || input > userChoices);
        return input;
    }

    public static void clearConsole(){
        for(int i = 0; i < 4; i++)
            System.out.println();

    }

    public static void anythingToContinue(){
        System.out.println("Enter anything to continue...");
        scanner.next();
    }

    public static void startGame(){
        boolean nameSet = false;
        String name;
        //print title screen
        clearConsole();
        System.out.println("\n \n \n \n");
        System.out.println("Swingy");
        System.out.println("Let us see if this game works boiiii");
        System.out.println("\n \n \n \n");
        anythingToContinue();

        //getting the player name
        do{
            clearConsole();
            System.out.println("What is your name");
            name = scanner.next();
            //ask player if he wants to correct the name
            clearConsole();
            System.out.println("You name is " + name + ".\nIs that correct?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int input = readInt("-> " , 2);
            if(input == 1)
                nameSet = true;
        }while (!nameSet);

        //create a new player object
        player = new Player(name);

        //setting isRunning to true so that the game can continue
        isRunning = true;

        //start main game loop(next part)
        gameLoop();
    }

    // method to continue the journey (more next)
    public static void continueJourney(){

    }

    public static void characterInfo(){
        clearConsole();
        System.out.println("CHARACTER INFOMATION\n\n\n\n");
        System.out.println(player.name + "\tHit Points" + player.hitPoints + "/" + player.maxHitPoint);
        System.out.println("Experience Points: " + player.experiencePoints);

        //printing the chosen traits
        if(player.numberAttackUpgrades > 0){
            System.out.println("Offensive trait: " + player.attackUpgrades[player.numberAttackUpgrades - 1]);
            System.out.println("\n\n\n\n");
        }
        if(player.numberDefensiveUpgrades > 0){
            System.out.println("Defensive trait: " + player.defenseUpgrades[player.numberDefensiveUpgrades -1]);
        }
        anythingToContinue();
    }

    //printing the main menu
    public static void printMenu(){
        clearConsole();
        System.out.println("\n This is the Menu\n\n");
        System.out.println("Please choose an action");
        System.out.println("\n\n\n");
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) See my Character information");
        System.out.println("(3) Exit Game");
    }

    //main game loop
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1){
                continueJourney();
            }else if(input == 2){
                characterInfo();
            }else
                isRunning = false;
        }
    }
}
