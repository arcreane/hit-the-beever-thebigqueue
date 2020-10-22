package com.company;

import java.util.Scanner;

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
        System.out.println("\t v : View HighScore");
        System.out.println("\t q : Quit");
    }

    public static void printMenu2() { //switch case pr la ref
        System.out.println("Please select your option below:");
        System.out.println("    4 : easy level");
        System.out.println("    5 : medium level");
        System.out.println("    6 : hard level");

    }

    public static void showMenu(int numberOfTurn, int boardWidth, String[][] board) {
        printMenu();
        Scanner choosenMenu = new Scanner(System.in);
        String userChoice = choosenMenu.next();

        switch (userChoice) {
            case "n":
                theTimer(numberOfTurn, boardWidth, board);
                break;
            case "v":
                System.out.println("High Score");
                break;
            case "q":
                System.out.println("See you next time");
                break;
            default:
                showMenu(numberOfTurn,boardWidth,board);
        }

    }

}

