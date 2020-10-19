package com.project;

public class Main {

    public static void main(String[] args)
    {
        if (args.length == 1)
        {
            if (args[0].equalsIgnoreCase("console"))
            {
                GameLogic.startGame();
            } else
            {
                System.out.println("type \"console\" as an argument.");
            }
        } else
        {
            System.out.println("type \"console\" as an argument.");
        }
        
    }
}
