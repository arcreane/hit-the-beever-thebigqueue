package com.company;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Timer chrono = new Timer();

    public static void main(String[] args) {

        // write your code here
        //board initialization 
        int numberOfTurn = 5;
        int boardWidth=5;

        MenuPrincipale.printHeader();

        MenuPrincipale.printMenu();
        Scanner choosenMenu = new Scanner(System.in);
        String userChoice = choosenMenu.next();

        MenuPrincipale.selectLevel();
        String userLevel = choosenMenu.next();
        switch (userLevel){
            case "e":  boardWidth = 5;break;
            case "m":  boardWidth =7;break;
            case "h":  boardWidth = 10;break;
        }

        // Le plateau carré sera défini par sa largeur, fonction de la difficulté
        String[][] board = new String[boardWidth][boardWidth];

        MenuPrincipale.showMenu(numberOfTurn,boardWidth, board,userChoice);
    }

    public static void theTimer(int numberOfTurn, int boardWidth, String[][] board) {  //____________________________
        chrono.schedule(new TimerTask() {
            int time = numberOfTurn;
            String mongoosePlace = "";
            String userResult = "";
            int score = 0;
            String[][] hallOfFame = new String[5][2];


            @Override
            public void run() {

                System.out.println("il reste " + time + " tour(s)");
                if (Functions.refreshBoard(boardWidth, board, mongoosePlace, userResult)) {
                    score++;
                }

                time--;
                if (time == 1) {
                    cancel();
                    Functions.gameOver(score, hallOfFame);
                }
                System.out.println("Score: " + score);
            }
        }, 1000, 1000);

        //____________________________}

    }
}

