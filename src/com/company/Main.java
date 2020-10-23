package com.company;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Timer chrono = new Timer();

    public static void main(String[] args) {
        //board initialization
        int numberOfTurn = 10;
        int boardWidth = 5;

        //_____ invite de choix menu principale
        MenuPrincipale.printHeader();

        MenuPrincipale.printMenu();
        Scanner choosenMenu = new Scanner(System.in);
        String userChoice = choosenMenu.next();

        MenuPrincipale.selectLevel();
        String userLevel = choosenMenu.next();
        //_____ invite de choix menu principale


        // Le plateau carré sera défini par sa largeur, fonction de la difficulté
        switch (userLevel) {
            case "e":
                boardWidth = 5;
                break;
            case "m":
                boardWidth = 7;
                break;
            case "h":
                boardWidth = 10;
                break;
        }

        String[][] board = new String[boardWidth][boardWidth];

        MenuPrincipale.showMenu(numberOfTurn, boardWidth, board, userChoice);
    }

    public static void theTimer(int numberOfTurn, int boardWidth, String[][] board) {
        chrono.schedule(new TimerTask() {
            int time = numberOfTurn;
            int score = 0;

            @Override
            public void run() {

                System.out.println("il reste " + time + " tour(s)");
                if (Functions.refreshBoard(boardWidth, board)) {
                    score++;
                }
                time--;
                if (time == 0) {
                    cancel();
                    Functions.gameOver(score);
                }
                System.out.println("Score: " + score);
            }
        }, 1000, 1000);


    }
}

