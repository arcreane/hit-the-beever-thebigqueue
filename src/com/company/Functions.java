package com.company;

import java.util.Random;
import java.util.Scanner;

public class Functions {

    public static void separateBars(int boardWidth) {
        for (int loop = 0; loop < boardWidth + 2 + (2 * boardWidth); loop++) {
            System.out.print('-');
        }
        // Le déboggueur le qualifie de non-nécessaire mais il FAUT LE GARDER pour le bien du programme!!!
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

    public static boolean refreshBoard(int boardWidth, String[][] board) {
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
        String mongoosePlace = (CoordMongooseX + "" + CoordMongooseY);
        String userResult = coordInput.next();

        //Le if peut-être simplifié mais pour une raison qui m'échappe le programme plante en me demandant un return
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

    public static void gameOver(int score) {
        //Affichage du score
        System.out.println("votre score est de: " + score);
        // refaire une partie
    }
}


