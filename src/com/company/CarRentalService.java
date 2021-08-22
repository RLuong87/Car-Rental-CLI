package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalService {
    private String make;
    private String model;

    CarRentalService(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void start() {
        System.out.println("===============================");
        System.out.println("Welcome to Richie's Car Rental");
        System.out.println("===============================");
        setOption();
    }

    public static void showMenu(List<CarRentalService> cars) {
        System.out.println();
        System.out.println("Available Cars");
        System.out.println("-----------------------------------");
        // Loop through the array list
        for (int i = 0; i < cars.size(); i++) {
            CarRentalService auto = cars.get(i);
            // %d place holder for integer, %s place holder for string
            System.out.printf("%d. %s %s\n", i + 1, auto.getMake(), auto.getModel());
        }
        System.out.printf("%d. Exit\n", cars.size() + 1);
//        Cars.show(Cars.carsList);
        System.out.println("------------------------------------");
        System.out.println("Enter a number to select the car you'd like to rent");
        System.out.print("Selection: ");
    }

//    Conversion characters are only valid for certain data types. Here are some common ones:
//    s formats strings.
//    d formats decimal integers.
//    f formats floating-point numbers.
//    t formats date/time values

    public static void transaction(int choice, List<CarRentalService> cars) {
        CarRentalService item = cars.get(choice - 1);
        System.out.println();
        System.out.printf("You've selected the %s %s", item.getMake(), item.getModel());
        System.out.println();
    }

    public static void setOption() {
        int choice = 0;

        List<CarRentalService> carMenu = new ArrayList<>();
        carMenu.add(new CarRentalService("Honda", "Accord"));
        carMenu.add(new CarRentalService("Toyota", "Camry"));
        carMenu.add(new CarRentalService("Chevy", "Impala"));
        carMenu.add(new CarRentalService("Acura", "TSX"));

        int exit = carMenu.size() + 1;

        CLI.scanner = new Scanner(System.in);

        while (choice != exit) {
            // Menu
            showMenu(carMenu);
            choice = CLI.scanner.nextInt();

            transaction(choice, carMenu);

//            try {
//                choice = CLI.scanner.nextInt();
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Invalid selection, please try again.");
////                showMenu(carMenu);
//            }

            switch (choice) {
                case 1:
//                    System.out.println("You've selected the " + carMenu.get(0));
                    carMenu.remove(0);
                    break;
                case 2:
//                    System.out.println("You've selected the " + carMenu.get(1));
                    carMenu.remove(1);
                    break;
                case 3:
//                    System.out.println("You've selected the " + carMenu.get(2));
                    carMenu.remove(2);
                    break;
                case 4:
//                    System.out.println("You've selected the " + carMenu.get(3));
                    carMenu.remove(3);
            }
        }
        CLI.scanner.close();
        System.out.println("****************************");
        System.out.println("Thank you, have a great day!");
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



