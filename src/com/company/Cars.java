package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    //    private int year;
    private String make;
    private String model;

    public Cars(String make, String model) {
//        this.year = year;
        this.make = make;
        this.model = model;
    }

    public static void carsAvail() {
        List<Cars> rented = new ArrayList<>();

        Cars honda = new Cars("Honda", "Accord");
        rented.add(honda);

        Cars toyota = new Cars("Toyota", "Camry");
        rented.add(toyota);

        Cars jeep = new Cars("Jeep", "Grand Cherokee");
        rented.add(jeep);

        Cars cadillac = new Cars("Cadillac", "Escalade");
        rented.add(cadillac);

        System.out.println(rented.get(0));
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public int getYear() {
//        return year;
//    }

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
