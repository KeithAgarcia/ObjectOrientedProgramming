package com.theironyard.clt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        Boat boat = new Boat("Seashore", 30);
        Car car = new Car("Lexus", 27);
        Plane plane = new Plane("Flyer", 38);
        Motorcycle motorcycle = new Motorcycle("Harley", 57);

        inventory.add(boat);
        inventory.add(motorcycle);
        inventory.add(plane);
        inventory.add(car);

        System.out.println(inventory);
    }
}
