package com.theironyard.clt;

import java.util.ArrayList;


public class InventoryItem {
    String category;
    int quantity;
    String name;

    @Override
    public String toString() {
        return String.format("You have %d items with name %s (category: %s)", quantity, name, category);
    }
}


