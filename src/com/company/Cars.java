package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final String make;
    private final String model;
    private boolean available;
    public static List<Cars> carMenu = new ArrayList<>();

    public Cars(String make, String model) {
        this.make = make;
        this.model = model;
        available = true;
    }

    public static void inventory() {
        carMenu.add(new Cars("Honda", "Civic Type R"));
        carMenu.add(new Cars("Toyota", "Supra"));
        carMenu.add(new Cars("Nissan", "350Z"));
        carMenu.add(new Cars("Acura", "NSX"));
        carMenu.add(new Cars("Nissan", "Skyline GTR"));
        carMenu.add(new Cars("Mitsubishi", "Eclipse"));
    }

    public static void showInventory() {
        for (Cars car: carMenu) {
            System.out.println(car.isAvaialable());
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

    public boolean isAvaialable() {
        return available;
    }

    public void setAvaialable(boolean avaialable) {
        this.available = avaialable;
    }

    public static List<Cars> getCarMenu() {
        return carMenu;
    }

    public static void setCarMenu(List<Cars> carMenu) {
        Cars.carMenu = carMenu;
    }
}