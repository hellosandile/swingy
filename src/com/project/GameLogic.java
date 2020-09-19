package com.project;

import java.util.Scanner;

public class GameLogic{
    static Scanner scanner = new Scanner(System.in);

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

}
