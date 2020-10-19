package com.project;

import com.project.person.HeroType;
import com.project.person.enemy.EnemyType;
import com.project.person.enemy.Aku;
import com.project.person.enemy.iEnemy;
import com.project.person.hero.Animaniac;
import com.project.person.hero.Hero;
import com.project.person.hero.iHero;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameLogic{
    static Scanner scanner = new Scanner(System.in);

    static Hero player;
    public static iHero _ihero = null;
    public static iEnemy _IEnemy = null;
    public static GamePlay gamePlay = new GamePlay();
    

    public static boolean isRunning ;

    public static String [] enemies = {"Aku", "Scar", "Shredder", "TheEvilQueen"};

    //Story elements
    //public static int place = 0, act;
    //public static String[] places = {"Northing", "Easting", "Southing", "Westing"};
    //private static com.project.HeroType HeroType;
    // private static EnemyType enemyType;

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
                System.out.println("Please enter the correct ");
            }

        }while(input < 1 || input > userChoices);
        return input;
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
        int x = 1;
        //print title screen
        Story.clearConsole();
        Story.printGameIntro();;

        //getting the player name
        do{
            System.out.println("\nPlease enter your name");
            name = scanner.next();
            //ask player if he wants to correct the name
            Story.clearConsole();
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
            Story.clearConsole();

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
        if(x == 1){
            try{
                _ihero = HeroType.newType(name, heroName, 1, 1000, 30, 90, 300);
                ((Hero)_ihero).validate();
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            
        }
         _IEnemy = EnemyType.enemyType("Aku", ThreadLocalRandom.current().nextInt(0,20), ThreadLocalRandom.current().nextInt(50,100), ThreadLocalRandom.current().nextInt(30,70));
        //  _IEnemy = EnemyType.enemyType("Max",enemies[1]);

        //setting isRunning to true so that the game can continue
        isRunning = true;

        //start main game loop(next part)

        gameLoop();
    }

    // method to continue the journey (more next)
    public static void startJourney(){
        
        //So this is where I want to give the option to go NESW, call the actual battle method until dead or leveled up.
        // _ihero.playing();
        // _IEnemy.Enemyplaying();
        System.out.println("Aku Attack : " + _IEnemy.getAku().getAttack());

        gamePlay.MapDisplay();
        do{
            System.out.println("\nPlease choose a directions");
            System.out.print("\n");
            System.out.println("(1) North");
            System.out.println("(2) East");
            System.out.println("(3) South");
            System.out.println("(4) West");
            int input = readInt("-> " , 4);
            Story.clearConsole();
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
        Story.clearConsole();
        System.out.println("My Character INFORMATION\n----------------\n");
        System.out.println("Name: " + ((Hero)_ihero).name);
        System.out.println("Hero Type: " + ((Hero)_ihero).heroName);
        System.out.println("Level: " + ((Hero)_ihero).level);
        System.out.println("Experience: " + ((Hero)_ihero).experience);
        System.out.println("Attack: " + ((Hero)_ihero).attack);
        System.out.println("Defence: " + ((Hero)_ihero).defence);
        System.out.println("Hit Points: " + ((Hero)_ihero).hitPoint);

    }

    //printing the main menu
    public static void printMenu(){
        Story.clearConsole();
        System.out.print("This is the Menu\n------------------\n");
        System.out.println("Please choose an action");
        System.out.print("\n");
        System.out.println("(1) Start your journey");
        System.out.println("(2) See my MyCharacter information");
        System.out.println("(3) Exit Game");
    }


    public static void randomEncounter(){
        int encounter = (int) (Math.random()) * enemies.length;

        if(enemies[encounter].equals("Aku")){
        }else if (enemies[encounter].equals("Scar")){
            //something to fight scar
        }else if (enemies[encounter].equals("Shredder")){
            //something to fight Shredder
        }else{
            //something to fight TheEvilQueen
        }
    }

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
