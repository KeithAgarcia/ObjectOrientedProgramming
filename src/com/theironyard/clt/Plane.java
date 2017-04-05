package com.theironyard.clt;

/**
 * Created by Keith on 4/5/17.
 */
public class Plane extends InventoryItem {
    public Plane(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.category = "Plane";
    }
}
