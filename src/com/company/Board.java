package com.company;

import java.util.Random;

public class Board {
    static public void Hello() {
        //la difficulté définira la largeur
        int boardWidth = 5;
        float randomAbscisse = (float) (Math.random() * boardWidth);


        //String[][] board = new String[boardWidth][boardWidth];
        System.out.println(randomAbscisse);

    }
}

