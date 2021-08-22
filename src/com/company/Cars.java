package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private String make;
    private String model;
    public static List<Cars> carsList = new ArrayList<>();

    Cars(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void carsAvail() {
//        carsList = new ArrayList<>();
        carsList.add(new Cars("Honda", "Accord"));
        carsList.add(new Cars("Toyota", "Camry"));
        carsList.add(new Cars("Chevy", "Impala"));
        carsList.add(new Cars("Acura", "TSX"));
    }

    public static void show(List<Cars> car) {
        for (int i = 0; i < car.size(); i++) {
            Cars auto = car.get(i);
            // %d place holder for integer, %s place holder for string
            System.out.printf("%d. %s %s\n", i + 1, auto.getMake(), auto.getModel());
        }
        System.out.printf("%d. Exit\n", car.size() + 1);
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
