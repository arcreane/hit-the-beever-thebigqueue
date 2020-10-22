package com.company;

public class Menu {
    boolean exit = false;

    public static void main(String[] args) {
        printHeader();
        printMenu();
        // scanner pr aavoir la valeur mvq
        printMenu2();
    }

    public static void printHeader() {
        System.out.println("***************************");
        System.out.println("\t Tape Marmot Game");
        System.out.println("\t don't loose");
        System.out.println("****************************");
    }

    public static void printMenu() {
        System.out.println("Please select one option below");
        System.out.println("    n : New Game");
        System.out.println("    v : View HighScore");
        System.out.println("    q : Quit");

    }

    //int choice = sc.nextInt();
    //switch(choice)
    //case n:
    //NewGame();
    //break;
    // case v:

    public static void printMenu2() {
        System.out.println("Please select your option below:");
        System.out.println("    e : easy level");
        System.out.println("    m : medium level");
        System.out.println("    h : hard level");

    }

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
        }

        }
    }