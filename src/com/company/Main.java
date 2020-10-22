package com.company;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Timer chrono = new Timer();

    public static void main(String[] args) {

        // write your code here
        //board initialization 
        int boardWidth = 7;
        int numberOfTurn = 5;

        // Le plateau carré sera défini par sa largeur, fonction de la difficulté
        String[][] board = new String[boardWidth][boardWidth];

        Scanner choosenMenu = new Scanner(System.in);

        MenuPrincipale.printHeader();
        MenuPrincipale.printMenu();
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
                System.out.println("Mauvais Choix");
        }


    }

    public static void theTimer(int numberOfTurn, int boardWidth, String[][] board) {  //____________________________
        chrono.schedule(new TimerTask() {
            int time = numberOfTurn;

            @Override
            public void run() {
                System.out.println("il reste " + time + " tour(s)");
                Functions.refreshBoard(boardWidth, board);
                time--;
                if (time == 1) {
                    cancel();
                }
            }
        }, 1000, 1000);

        //____________________________}

    }
}

