package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
    public static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;

    public static void getInt() {

        while (true) {
            try {
                choice = CLI.scanner.nextInt();
//                CarRentalService.options();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid selection, please try again.");
            } catch (InputMismatchException ex) {
//                System.out.println("Invalid selection, please try again.");
            }
        }
    }

    public static int getChoice() {
        return choice;
    }
}

