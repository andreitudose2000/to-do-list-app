package com.andreitudose.models;

import java.util.List;

public class ItemList {

    private List<Item> items;

    private String color;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
