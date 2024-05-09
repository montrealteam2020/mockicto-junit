package com.mockito.unittesting.business;

import com.mockito.unittesting.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemsService {


    public Item retreiveAll() {
        return new Item(2,"Bag",2,3);
    }
}
