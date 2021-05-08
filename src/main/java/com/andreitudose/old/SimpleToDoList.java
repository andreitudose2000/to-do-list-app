package com.andreitudose.old;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


//@Component
public class SimpleToDoList implements ToDoList {


    private String color;

    List<Item> itemList = new ArrayList<>();

    //@Value("simpleTheme")
    private Theme theme;

    private LinkedHashMap<String, String> themes;

    public SimpleToDoList() {
        themes = new LinkedHashMap<>();

        themes.put("light", "Light Theme");
        themes.put("dark", "Dark Theme");
        themes.put("custom", "Custom Theme");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void addItem(Item item) {
        this.itemList.add(item);
    }

    @Override
    public void removeItem(Item item) {
        itemList.remove(item);
    }

    @Override
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public Theme getTheme() {
        return theme;
    }

    @Override
    public List<Item> getItemList() {
        return itemList;
    }

    public LinkedHashMap<String, String> getThemes() {
        return themes;
    }
}
