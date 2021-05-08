package com.andreitudose.services;

import com.andreitudose.old.Item;
import com.andreitudose.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    //@Autowired
    //ItemRepository itemRepository;

    public List<Item> getItems() {
        return null; //itemRepository.findAll();
    }
}
