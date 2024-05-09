package com.mockito.unittesting.controllers;

import com.mockito.unittesting.business.ItemsService;
import com.mockito.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemsService itemService;
    @GetMapping("/item")
    public Item getItem(){
        return new Item(1,"pen",2,3);

    }
    @GetMapping("/all-items")
    public Item getItems(){
        return itemService.retreiveAll();
    }
}
