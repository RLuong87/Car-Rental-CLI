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
    public static char opt;
    public static String customerName;

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
        System.out.println("To start over enter '0' or to EXIT enter '99'");
        System.out.println("---------------------------------------------------");
        if (cars.isEmpty()) {
            System.out.print("There are no more available cars.\nWould you like to start over or EXIT the program? ");
        } else
        System.out.print("Selection: ");
    }

    public static void carLot() {
        carMenu.add(new Cars("Honda", "Civic Type R"));
        carMenu.add(new Cars("Toyota", "Supra"));
        carMenu.add(new Cars("Subaru", "WRX"));
        carMenu.add(new Cars("Acura", "NSX"));
        carMenu.add(new Cars("Nissan", "Skyline GTR"));
        carMenu.add(new Cars("Mitsubishi", "Eclipse"));
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
                        System.out.println("Are you sure you want to rent the " + carMenu.get(0));
                        System.out.print("Confirm (Y/N): ");
                        opt = CLI.scanner.next().toUpperCase().charAt(0);
                        if (opt == 'Y') {
                            System.out.print("What is the name you would like to use to return your rental?\nEnter Name: ");
                            customerName = CLI.scanner.next();
                            CLI.scanner.next();
                            CLI.scanner.nextLine();
                            System.out.print("You entered " + customerName + "\nIf this is correct enter 'Y', if this is incorrect enter 'N' to try again: ");
                            CLI.scanner.nextLine();
                        } else
                            carMenu.clear();
                            setOption();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("You've selected the " + carMenu.get(1));
                        carMenu.remove(1);
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("You've selected the " + carMenu.get(2));
                        carMenu.remove(2);
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("You've selected the " + carMenu.get(3));
                        carMenu.remove(3);
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("You've selected the " + carMenu.get(4));
                        carMenu.remove(4);
                        break;
                    case 6:
                        System.out.println();
                        System.out.println("You've selected the " + carMenu.get(5));
                        carMenu.remove(5);
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
