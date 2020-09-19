package com.project;

public class Main {

    public static void main(String[] args) {
        GameLogic.clearConsole();
        int input = GameLogic.readInt("Enter 1, 2 ro 3: ", 3);
        System.out.println("You chose number: " +  input);
    }
}
