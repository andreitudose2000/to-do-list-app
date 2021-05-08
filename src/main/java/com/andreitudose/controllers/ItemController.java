package com.andreitudose.controllers;

import com.andreitudose.Item;
import com.andreitudose.SimpleItem;
import javax.validation.Valid;

import com.andreitudose.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {

        StringTrimmerEditor stringTrimmerEditor =
                new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/addItem")
    public String addItem(Model model) {

        model.addAttribute("simpleItem", new SimpleItem());

        return "add-item";
    }

    @RequestMapping("/processItem")
    public String processItem(
            @Valid @ModelAttribute("simpleItem") SimpleItem simpleItem,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "add-item";
        } else {
            return "added-item";
        }
    }

    @RequestMapping("/")
    public String getItems() {

        List<Item> items = itemService.getItems();

        return "items";
    }
}
