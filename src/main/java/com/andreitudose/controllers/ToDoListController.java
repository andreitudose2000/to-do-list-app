package com.andreitudose.controllers;

import com.andreitudose.SimpleToDoList;
import com.andreitudose.SimpleItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/settings")
public class ToDoListController {

    @RequestMapping("/configureList")
    public String configureList(Model model) {

        SimpleToDoList simpleToDoList = new SimpleToDoList();
        model.addAttribute("simpleToDoList", simpleToDoList);

        return "list-settings";
    }

    @RequestMapping("/settingsSaved")
    public String settingsSaved(@ModelAttribute("simpleToDoList") SimpleToDoList simpleToDoList) {

        return "list-settings-saved";
    }

}
