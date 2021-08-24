package com.company;

import java.util.Scanner;

public class CLI {
    static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {

        int num = scanner.nextInt();
        while (true) {
            try {
                num = scanner.nextInt();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid selection, please try again.");
            } catch (NumberFormatException ex) {
                scanner.nextLine();
                System.out.println("Invalid selection, please try again.");
            }
            return num;
        }
    }
}

//    public static int getNum(int min, int max) {
//        //System.out.println("Please enter a number.");
//        int num;
//        while (true)
//            try {
//                num = Integer.parseInt(input.nextLine());
//                if (num > max || num < min){
//                    System.out.println("Enter a number between 1-4");
//                }else {
//                    break;
//                }
//            } catch (NumberFormatException nfe) {
//                System.out.print("Enter a number between 1-4");
//            }
//        return num;
//    }
