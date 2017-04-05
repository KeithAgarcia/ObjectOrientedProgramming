package com.theironyard.clt;

/**
 * Created by Keith on 4/5/17.
 */
public class Car extends InventoryItem {
    public Car(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Car";
    }
}
