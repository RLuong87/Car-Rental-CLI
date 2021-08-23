package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cars {
    private String make;
    private String model;
    private static boolean exit = false;

    Cars(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void showMenu(List<Cars> cars) {
        System.out.println();
        System.out.println("Available Cars");
        System.out.println("-----------------------------------");
        // Loop through the array list
        for (int i = 0; i < cars.size(); i++) {
            Cars auto = cars.get(i);
            // %d place holder for integer, %s place holder for string
            System.out.printf("%d. %s %s\n", i + 1, auto.getMake(), auto.getModel());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Enter a number to select the car you'd like to rent");
        System.out.println("Enter '0' to start over");
        System.out.println("Enter '99' to quit");
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

    public static void setOption() {
        List<Cars> carMenu = new ArrayList<>();
        carMenu.add(new Cars("Honda", "Accord"));
        carMenu.add(new Cars("Toyota", "Camry"));
        carMenu.add(new Cars("Chevy", "Impala"));
        carMenu.add(new Cars("Acura", "TSX"));
        carMenu.add(new Cars("Dodge", "Durango"));
        int choice = 0;

        while (!exit) {
            showMenu(carMenu);
            try {
                choice = CLI.scanner.nextInt();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid selection, please try again.");
            } catch (InputMismatchException ex) {
                System.out.println("Invalid selection, please try again.");
            }

            switch (choice) {
                case 1:
                    System.out.println("You've selected the " + carMenu.get(0));
                    carMenu.remove(0);
                    break;
                case 2:
                    System.out.println("You've selected the " + carMenu.get(1));
                    carMenu.remove(1);
                    break;
                case 3:
                    System.out.println("You've selected the " + carMenu.get(2));
                    carMenu.remove(2);
                    break;
                case 4:
                    System.out.println("You've selected the " + carMenu.get(3));
                    carMenu.remove(3);
                case 5:
                    System.out.println("You've selected the " + carMenu.get(4));
                    carMenu.remove(4);
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }
            if (choice == 0) {
                setOption();
            } else if (choice == 99) {
                System.out.println("*****************");
                System.out.println("Have a great day!");
                System.out.println("*****************");
                exit = true;
                CLI.scanner.close();
            }
        }
    }

    public static boolean isExit() {
        return exit;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}
