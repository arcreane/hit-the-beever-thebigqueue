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
        MenuPrincipale.showMenu(numberOfTurn, boardWidth, board);
    }

    public static void theTimer(int numberOfTurn, int boardWidth, String[][] board) {  //____________________________
        chrono.schedule(new TimerTask() {
            int time = numberOfTurn;
            String mongoosePlace = "";
            String userResult = "";


            @Override
            public void run() {
                System.out.println("il reste " + time + " tour(s)");
                Functions.refreshBoard(boardWidth, board, mongoosePlace,userResult);
                time--;
                if (time == 1) {
                    cancel();
                }
            }
        }, 1000, 7000);

        //____________________________}

    }
}

