package com.company;

import java.util.Random;
import java.util.Scanner;

public class Functions {
    public static void separateBars(int boardWidth) {
        for (int loop = 0; loop < boardWidth + 2 + (2 * boardWidth); loop++) {
            System.out.print('-');
        }
        System.out.println("");
    }

    public static void fillInSocket(int level, String[][] board) {
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level; j++) {
                board[i][j] = ".";
            }
        }
    }

    //tableau
    // board[i][0] correspond à l'abscisse/horizontale
    // board[0][j] correspond à l'ordonnée/verticale

    public static void placeMongoose(int X, int Y, String[][] board) {
        //on récupère des coordonées que l'on donne au plateau
        board[X][Y] = String.valueOf('M');
    }

    public static boolean refreshBoard(int boardWidth, String[][] board, String mongoosePlace, String userResult) {
        //initialisation du plateau
        fillInSocket(boardWidth, board);
        Scanner coordInput = new Scanner(System.in);
        // on choisi une position pour la marmotte
        int CoordMongooseX = (Functions.coordMongoose(boardWidth))[0];
        int CoordMongooseY = (Functions.coordMongoose(boardWidth))[1];
        // on déplace la marmotte
        placeMongoose(CoordMongooseX, CoordMongooseY, board);
        // on affiche le board//
        drawBoard(boardWidth, board);
        // saisir les coordonnées
        mongoosePlace = String.valueOf(CoordMongooseX + "" + CoordMongooseY);
        System.out.println(mongoosePlace);
        userResult = coordInput.next();
        System.out.println(userResult);
        if (mongoosePlace.equals(userResult)) {
            return true;
        } else {
            return false;
        }
    }

    public static void drawBoard(int boardWidth, String[][] board) {
        separateBars(boardWidth);
        for (int i = 0; i < boardWidth; i++) {
            System.out.print('|');
            for (int j = 0; j < boardWidth; j++) {
                System.out.print(" " + board[j][i] + " ");
            }
            System.out.print('|');
            System.out.println();
        }
        separateBars(boardWidth);
    }

    public static int[] coordMongoose(int boardWidth) {
        Random random = new Random();
        int[] arrayMongoose = new int[2];
        for (int i = 0; i < arrayMongoose.length; i++) {
            arrayMongoose[i] = random.nextInt(boardWidth);
        }
        return arrayMongoose;
    }

    public static void gameOver(int score, String[][] hallOfFame) {
        //hallOfFame[i][1] score
        //hallOfFame[i][0] nom
        //Si tableau score valable, on inclue le score et le nom
        for (int i = 0; i < hallOfFame.length; i++) {
            if (hallOfFame[i][1] == null) {
                hallOfFame[i][1] = String.valueOf(score);
                break;
            }
        }

        //On demande le nom, et on associe le score
        Scanner userName = new Scanner(System.in);
        // on trie le tableau
        // On affiche le tableau
        for (int i = 0; i < hallOfFame.length; i++) {
            System.out.println(hallOfFame[i][1]);
        }

        //Affichage du score
        System.out.println("votre score est de: " + score);
        // refaire une partie
    }
}


