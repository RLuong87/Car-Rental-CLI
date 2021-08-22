package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalService {
    //    private static String make;
//    private static String model;
    public static int option;
    public static List<Cars> rented = new ArrayList<>();

    public static void start() {
        System.out.println("Welcome to Richie's Car Rental");
        menu();
    }

    public static void menu() {
        CLI.scanner = new Scanner(System.in);
        option = 5;

        while (true) {
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println("Please make a selection");
            System.out.println("------------------------------------");
            System.out.print("Selection: ");

            try {
                option = CLI.scanner.nextInt();
            } catch (Exception e) {
                System.out.println();
                System.out.println("\tCar Selection invalid.\n\t\tPlease try again.");
                menu();
            }
            if (option == 1) {
                System.out.print("You've selected the ");
                Cars.carsAvail();
            } else if (option == 2) {
                System.out.println("You've selected the \"Toyota Camry\"");
            } else if (option == 3) {
                System.out.println("You've selected the \"Jeep Grand Cherokee\"");
            } else if (option == 4) {
                System.out.println("You've selected the \"Cadillac Escalade\"");
            } else if (option == 5) {
                System.out.println("Thank you, have a great day!");
                break;
            } else {
                System.out.println();
                System.out.println("\tThat is not a valid option.\n\t\tPlease try again.");
            }
        }
    }

    public static void rented() {
        rented = new ArrayList<>();

    }
}



