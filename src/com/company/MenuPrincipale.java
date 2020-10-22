package com.company;

import java.util.Scanner;

public class MenuPrincipale {

    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //default:{System.out.println("-- serieux ! recommence");}

        switch (str) {
            case "n":
                System.out.println("Let's play Looser" + str);
            case "v":
                System.out.println("High Score" + str);
            case "q":
                System.out.println("Bye Bye" + str);
                break;
            default:
                throw new IllegalStateException("-- serieux ! recommence" + str);
        }

        printMenu2();

    }*/

    public static void printHeader() {
        System.out.println("************************");
        System.out.println("\t Tape Marmot Game");
        System.out.println("\t don't loose");
        System.out.println("************************");
    }

    public static void printMenu() {
        System.out.println("Please select one option below");
        System.out.println("\t n : New Game");
        System.out.println("\t v : View HighScore");
        System.out.println("\t q : Quit");
    }

    public static void printMenu2() { //switch case pr la ref
        System.out.println("Please select your option below:");
        System.out.println("    4 : easy level");
        System.out.println("    5 : medium level");
        System.out.println("    6 : hard level");

    }

}

