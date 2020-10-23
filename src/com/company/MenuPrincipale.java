package com.company;

import static com.company.Main.theTimer;

public class MenuPrincipale {

    public static void printHeader() {
        System.out.println("************************");
        System.out.println("\t Tape Marmot Game");
        System.out.println("\t don't loose");
        System.out.println("************************");
    }

    public static void printMenu() {
        System.out.println("Please select one option below");
        System.out.println("\t n : New Game");
        System.out.println("\t q : Quit");
    }

    public static void selectLevel() {
        System.out.println("Please select your option below:");
        System.out.println("    e : easy level");
        System.out.println("    m : medium level");
        System.out.println("    h : hard level");
    }

    public static void showMenu(int numberOfTurn, int boardWidth, String[][] board, String userChoice) {
        System.out.println("UserChoice L28 " + userChoice);
        switch (userChoice) {
            case "n":
                //theTimer(numberOfTurn, boardWidth, board);
                break;
            case "q":
                System.out.println("See you next time");

                break;
            default:
                showMenu(numberOfTurn, boardWidth, board, userChoice);
        }
    }
}

