package com.company;

import java.util.List;

public class Menu {

    public static int choice;

    public static void start() {
        System.out.println("Welcome to RL Car Rental's");
        setOption();
    }

    public static void showMenu(List<Cars> cars) {
        // Loop through the array list
        System.out.println();
        System.out.println("Available Cars");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < cars.size(); i++) {
            Cars auto = cars.get(i);
            // %d place holder for integer, %s place holder for string
            System.out.printf("%d) %s %s\n", i + 1, auto.getMake(), auto.getModel());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Enter a number to select the car you'd like to rent");
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

    public static void transaction(int choice, List<Cars> cars) {
        Cars item = cars.get(choice - 1);
        System.out.printf("You've selected the %s %s to rent ", item.getMake(), item.getModel());
        cars.remove(choice - 1);
        System.out.println("\n");
    }

    public static void setOption() {
        Cars.inventory();
        while (true) {
            Menu.showMenu(Cars.carMenu);
            choice = CLI.getInt(1, 6);
            transaction(choice, Cars.carMenu);
            if (Cars.carMenu.isEmpty()) {
                choice = CLI.getInt("\"There are no available cars left to rent\"\nStart over, enter 1", 1, 1);
                Cars.carMenu.clear();
                setOption();
            }
        }
    }
}
