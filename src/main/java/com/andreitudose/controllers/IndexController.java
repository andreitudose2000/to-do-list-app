package com.andreitudose.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/testjdbc")
    public String testjdbc() {

        String jdbcUrl = "jdbc:mysql://localhost:3306/to_do_app?autoReconnect=true&useSSL=false";
        String user = "andreitudose";
        String pass = "andreitudose";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection(jdbcUrl, user, pass);
        } catch(Exception e) {
            e.printStackTrace();
            return "n-a mers";
        }

        return "a mers";
    }
}
