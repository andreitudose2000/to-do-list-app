package com.andreitudose.controllers;

import com.andreitudose.models.ItemList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/settings")
public class ToDoListController {

    @RequestMapping("/configureList")
    public String configureList(Model model) {

        ItemList itemList = new ItemList();
        model.addAttribute("itemList", itemList);

        return "list-settings";
    }

    @RequestMapping("/settingsSaved")
    public String settingsSaved(@ModelAttribute("simpleToDoList") ItemList itemList) {

        return "list-settings-saved";
    }

}
