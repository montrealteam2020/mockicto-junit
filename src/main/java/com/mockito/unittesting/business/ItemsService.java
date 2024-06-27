package com.mockito.unittesting.business;

import com.mockito.unittesting.data.ItemRepository;
import com.mockito.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemsService {

    @Autowired
    private ItemRepository itemRepository;

    public Item retrieveAll() {
        return new Item(2,"Bag",2,3);
    }

    public List<Item> retrieveAllItems(){
       List<Item> items= itemRepository.findAll();
        for(Item item:items)
            item.setValue(item.getQuantity()*item.getPrice());
       return items;
    }
}
