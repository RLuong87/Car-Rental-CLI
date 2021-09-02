package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String question, int min, int max) {

        while (true) {
            try {
                System.out.println(question);
                System.out.print("Input: ");
                int userInt = scanner.nextInt();

                if (userInt < min || userInt > max) {
                    System.out.println("\nInvalid, enter a number between " + min + " & " + max + "\n");
                } else {
                    return userInt;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nInvalid, you must enter a number between " + min + " & " + max + "\n");
                scanner.nextLine();
            }
        }
    }

    public static int getInt(int min, int max) {

        while (true) {
            try {
                int userInt = scanner.nextInt();

                if (userInt < min || userInt > max) {
                    System.out.println("\nInvalid selection! A number between " + min + " & " + max + "\n");
                } else {
                    return userInt;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nInvalid selection! A number between " + min + " & " + max + "\n");
                scanner.nextLine();
            }
        }
    }

    public static String getStr(String question) {

        while (true) {
            System.out.println(question);
            System.out.print("Input: ");
            scanner.nextLine();
            String userInput = scanner.nextLine().trim();

            if (!userInput.equals("")) {
                return userInput;
            } else {
                System.out.println("\nNah ah no you didn't! Try again!\n");
            }
        }
    }

    public static char getChar(String question) {

        while (true) {
            System.out.print(question);
            scanner.nextLine();
            char userChar = scanner.next().toUpperCase().charAt(0);

            if (userChar != ' ') {
                return userChar;
            } else {
                System.out.println("Enter an operator!");
            }
        }
    }

    public static void exit() {
        System.out.println("\n*************************************\n");
        System.out.println("\tThank you, come again!");
        System.exit(0);
        scanner.close();
    }

    public static int getInt(String question) {

        while (true) {
            try {
                System.out.print(question);
                return scanner.nextInt();

            } catch (InputMismatchException exception) {
                System.out.println("Sorry, you must enter a number");
                scanner.nextLine();
            }
        }
    }
}

