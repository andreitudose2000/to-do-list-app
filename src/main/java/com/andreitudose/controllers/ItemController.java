package com.andreitudose.controllers;

import com.andreitudose.models.Item;
import javax.validation.Valid;

import com.andreitudose.services.ItemService;
import com.mysql.cj.jdbc.BlobFromLocator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/items")
public class ItemController {

    //@Autowired
    //private ItemService itemService;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {

        StringTrimmerEditor stringTrimmerEditor =
                new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/addItem")
    public String addItem(Model model) {

        model.addAttribute("item", new Item());

        return "add-item";
    }

    @RequestMapping("/processItem")
    public String processItem(
            @Valid @ModelAttribute("item") Item item,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "add-item";
        }

        try (SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return "add-item";
        }

        return "added-item";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getItems() {

        ModelAndView modelAndView = new ModelAndView("items");

        List<Item> items;
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

            items = session
                    .createQuery("from Item")
                    .getResultList();

            modelAndView.addObject("items", items);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return modelAndView;
    }
}
