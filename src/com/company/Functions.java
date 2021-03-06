package com.company;

import java.util.Random;

public class Functions {
    public static void separateBars(int boardWidth) {
        for (int loop = 0; loop < boardWidth + 2 + (2 * boardWidth); loop++) {
            System.out.print('-');
        }
        System.out.println("");
    }

    public static void fillInSocket(int boardWidth, String[][] board) {
        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardWidth; j++) {
                board[i][j] = ".";
            }
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
}
