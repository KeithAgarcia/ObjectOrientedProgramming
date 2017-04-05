package com.theironyard.clt;

/**
 * Created by Keith on 4/5/17.
 */
public class Boat extends InventoryItem {
    public Boat(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.category = "Boat";
    }
}
