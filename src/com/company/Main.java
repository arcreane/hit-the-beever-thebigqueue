package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        // write your code here
        //board initialization 
        int boardWidth = 7;
        int numberOfTurn = 5;

        // Le plateau carré sera défini par sa largeur, fonction de la difficulté
        String[][] board = new String[boardWidth][boardWidth];

        Timer chrono = new Timer();
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

        Functions.refreshBoard(boardWidth, board);

    }
}

