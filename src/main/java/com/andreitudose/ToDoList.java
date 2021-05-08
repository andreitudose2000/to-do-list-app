package com.andreitudose;

import java.util.List;

public interface ToDoList {

    void addItem(Item item);

    void removeItem(Item item);

    void setTheme(Theme theme);

    Theme getTheme();

    List<Item> getItemList();
}
