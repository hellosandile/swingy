package com.project;

import com.project.person.enemy.EnemyType;
import com.project.person.enemy.TheEvilQueen;
import com.project.person.enemy.iEnemy;
import com.project.person.hero.Animaniac;
import com.project.person.hero.Hero;
import com.project.person.hero.iHero;

import java.util.Scanner;

public class GameLogic{
    static Scanner scanner = new Scanner(System.in);

    static Hero player;
    public static iHero _ihero = null;
    public static iEnemy _IEnemy = null;
    public static GamePlay gamePlay = new GamePlay();
    

    public static boolean isRunning ;

    public static String [] enemies = {"Aku", "Scar", "Shredder", "TheEvilQueen"};

    //Story elements
    public static int place = 0, act;
    public static String[] places = {"Northing", "Easting", "Southing", "Westing"};
    private static com.project.HeroType HeroType;
    private static EnemyType enemyType;

    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input = 0;

        do{
            System.out.println(prompt);
            try{
                if(input > userChoices){
                    throw new NumberFormatException();
                }
            }catch(NumberFormatException e){
                System.out.println("Please enter an integer!!!");
            }
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
        boolean heroSet = false;
        String name;
        String heroName = null;
        //print title screen
        clearConsole();
        Story.printGameIntro();;

        //getting the player name
        do{
            System.out.println("\nPlease enter your name");
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

        do{
            System.out.println("\nPlease Please choose a hero");
            System.out.print("\n");
            System.out.println("(1) Animaniac");
            System.out.println("(2) Flinstone");
            System.out.println("(3) PowerPuff");
            int input = readInt("-> " , 3);
            clearConsole();

            if(input == 1){
                heroName = "Animaniac";
                heroSet = true;
            }
            else if(input == 2){
                heroName = "Flinstone";
                heroSet = true;
            }
            else if(input == 3){
                heroName = "PowerPuff";
                heroSet = true;
            }

        }while(!heroSet);

        //create a new player object
         _ihero = HeroType.newType(name, heroName, 1, 100, 30, 25, 100);
         _IEnemy = EnemyType.newType("Max","Aku", 1, 100, 30, 25, 100);

        //setting isRunning to true so that the game can continue
        isRunning = true;

        //start main game loop(next part)

        gameLoop();
    }

    // method to continue the journey (more next)
    public static void startJourney(){
        //So this is where I want to give the option to go NESW, call the actual battle method until dead or leveled up.
        _ihero.playing();
        _IEnemy.Enemyplaying();
        gamePlay.MapDisplay();
        //int move  = 0;
        do{
            System.out.println("\nPlease choose a directions");
            System.out.print("\n");
            System.out.println("(1) North");
            System.out.println("(2) East");
            System.out.println("(3) South");
            System.out.println("(4) West");
            int input = readInt("-> " , 4);
            clearConsole();
            //System.out.println(input);

            if(input > 4 || input < 1 ){
                System.out.println("Please choose of the correct options");
            }else if(input == 1){
                //North counter must ++ if win until reaching border
                gamePlay.heroPosition(0, -1);
                gamePlay.MapDisplay();
            }
            else if(input == 2){
                //east counter ++......
                gamePlay.heroPosition(1, 0);
                gamePlay.MapDisplay();
            }
            else if(input == 3){
                //south counter++
                gamePlay.heroPosition(0, 1);
                gamePlay.MapDisplay();
            }
            else if(input == 4){
                //weest counter++....
                gamePlay.heroPosition(-1, 0);
                gamePlay.MapDisplay();
            }

        }while(true);


    }

    public static void MyCharacterInfo(){
        clearConsole();
        System.out.println("MyCharacter INFORMATION\n----------------\n");
        System.out.println(player.name + player.heroName);
        //System.out.println("Experience Points: " + player.experiencePoints);

        //printing the chosen traits
        //if(player.numberAttackUpgrades > 0){
        //    System.out.println("Offensive trait: " + player.attackUpgrades[player.numberAttackUpgrades - 1]);
        //    System.out.println("\n\n\n\n");
       // }
       // if(player.numberDefensiveUpgrades > 0){
       //     System.out.println("Defensive trait: " + player.defenseUpgrades[player.numberDefensiveUpgrades -1]);
        //}
        //anythingToContinue();
    }

    //printing the main menu
    public static void printMenu(){
        clearConsole();
        System.out.print("This is the Menu\n------------------\n");
        System.out.println("Please choose an action");
        System.out.print("\n");
        System.out.println("(1) Start your journey");
        System.out.println("(2) See my MyCharacter information");
        System.out.println("(3) Exit Game");
    }


    //calculate random encounter
    public static void randomEncounter(){
        //random number between 0 and the length of the enemies array
        int encounter = (int) (Math.random()) * enemies.length;

        if(enemies[encounter].equals("Aku")){
            //something to fight Aku
        }else if (enemies[encounter].equals("Scar")){
            //something to fight scar
        }else if (enemies[encounter].equals("Shredder")){
            //something to fight Shredder
        }else{
            //something to fight TheEvilQueen
        }
    }

    //main game loop
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1){
                startJourney();
            }else if(input == 2){
                MyCharacterInfo();
            }else
                isRunning = false;
        }
    }
}
