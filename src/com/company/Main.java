package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // write your code here
        //board initialization 
        int boardWidth = 5;
        int numberOfTurn = 10;
        int timer = 5;
        int CoordMongooseX = (Functions.coordMongoose(boardWidth))[0];
        int CoordMongooseY = (Functions.coordMongoose(boardWidth))[1];

        // Le plateau carré sera défini par sa largeur, fonction de la difficulté
        String[][] board = new String[boardWidth][boardWidth];

        //initialisation du Tableau-Plateau
        Functions.fillInSocket(boardWidth, board);

        //on place la marmotte
        Functions.placeMongoose(CoordMongooseX, CoordMongooseY, board);

        System.out.println("Shoot the Mongoose!!!");
        System.out.println("Tour n°1");

        // Dessine le plateau
        Functions.drawBoard(boardWidth, board);

    }
}

