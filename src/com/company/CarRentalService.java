package com.company;

import java.util.List;

public class CarRentalService {
    private static boolean exit = false;

    public static void start() {
        System.out.println("===============================");
        System.out.println("Welcome to Richie's Car Rental");
        System.out.println("===============================");
        display();
    }

    public static void display() {
        Cars.setOption();
    }
}


//    Conversion characters are only valid for certain data types. Here are some common ones:
//    s formats strings.
//    d formats decimal integers.
//    f formats floating-point numbers.
//    t formats date/time values

//    public static void transaction(int choice, List<CarRentalService> cars) {
//        CarRentalService item = cars.get(choice - 1);
//        System.out.println();
//        System.out.printf("You've selected the %s %s to rent ", item.getMake(), item.getModel());
//        System.out.println();
//    }



