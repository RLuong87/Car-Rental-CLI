package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Cars {
    private String make;
    private String model;
    public static List<Cars> carMenu = new ArrayList<>();
    public static boolean exit = false;
    public static int choice = 0;
    public static char opt = '0';

    public Cars(String make, String model) {
        this.make = make;
        this.model = model;
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
        System.out.println("Enter '0' to start over");
        System.out.println("Enter '99' to quit");
        System.out.println("---------------------------------------------------");
        System.out.print("Selection: ");
    }

//    public static void carLot() {
//        List<Cars> carMenu = new ArrayList<>();
//        carMenu.add(new Cars("Honda", "Accord"));
//        carMenu.add(new Cars("Toyota", "Camry"));
//        carMenu.add(new Cars("Chevy", "Impala"));
//        carMenu.add(new Cars("Acura", "TSX"));
//        carMenu.add(new Cars("Dodge", "Durango"));
//    }

    public static void carLot() {
        carMenu.add(new Cars("Honda", "Accord"));
        carMenu.add(new Cars("Toyota", "Camry"));
        carMenu.add(new Cars("Chevy", "Impala"));
        carMenu.add(new Cars("Acura", "TSX"));
        carMenu.add(new Cars("Nissan", "Skyline"));
    }

    public static void transaction(int choice, List<Cars> cars) {
        Cars item = cars.get(choice - 1);
        System.out.println();
        System.out.printf("You've selected the %s %s to rent ", item.getMake(), item.getModel());
        System.out.println();
    }

    public static void setOption() {
        carLot();

        while (!exit) {
            try {
                showMenu(carMenu);
                choice = CLI.scanner.nextInt();
//            transaction(choice, carMenu);

                switch (choice) {
                    case 1:
//                        System.out.println("You've selected the " + carMenu.get(0));
                        System.out.println();
                        System.out.println("You've selected the " + carMenu.get(0));
//                        System.out.println("Are you sure you want to rent the " + carMenu.get(0));
//                        System.out.println("Confirm (Y/N)");
//                        opt = CLI.scanner.next();
                        if (opt == 'Y') System.out.println("Please enter a name for this order");
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
                        break;
                    case 5:
                        System.out.println("You've selected the " + carMenu.get(4));
                        carMenu.remove(4);
                        break;
                    case 0:
                        if (choice == 0) carMenu.clear();
                        setOption();
                        break;
                    case 99:
                        System.out.println("*****************");
                        System.out.println("Have a great day!");
                        System.out.println("*****************");
                        exit = true;
                        CLI.scanner.close();
                        break;
                    default:
                        System.out.println("Invalid selection, please try again.");
                        break;
                }
            } catch (InputMismatchException ex) {
                CLI.scanner.nextLine();
                System.out.println("Invalid selection, please try again.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid selection, please try again.");
            }
        }
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
