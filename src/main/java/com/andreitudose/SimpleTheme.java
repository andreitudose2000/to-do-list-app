package com.andreitudose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.andreitudose.Theme;

//@Component
public class SimpleTheme implements Theme {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
