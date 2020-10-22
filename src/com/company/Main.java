package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // write your code here
        //board initialization 
        int boardWidth = 5;
        int numberOfTurn = 9;
        int timer = 5;
        // Le plateau carré sera défini par sa largeur, fonction de la difficulté
        String[][] board = new String[boardWidth][boardWidth];

        //initialisation du Tableau-Plateau
        Functions.fillInSocket(boardWidth, board);

        System.out.println("Shoot the Mongoose!!!");
        System.out.println("Tour n°1");

        //teset

        // Dessine le plateau
        Functions.drawBoard(boardWidth, board);

        //test retour des coordonées de la marmotte
        System.out.println((Functions.coordMongoose(boardWidth))[0]);
        System.out.println((Functions.coordMongoose(boardWidth))[1]);

    }
}

