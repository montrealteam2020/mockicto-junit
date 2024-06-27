package com.mockito.unittesting.business;

import com.mockito.unittesting.data.ItemRepository;
import com.mockito.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemsServiceTest {

    @InjectMocks
    ItemsService itemsService;
    @Mock
    ItemRepository itemRepo;

    @Test
    void test_get_all_from_db(){
        when(itemRepo.findAll()).thenReturn(Arrays.asList(new Item(1001,"Tomato",12,34),
                new Item(1001,"Garlic",70,10)));
       List<Item> itemsResult= itemsService.retrieveAllItems();
        assertEquals(2,itemsResult.size());
        assertEquals(408,itemsResult.get(0).getValue());
        assertEquals(700,itemsResult.get(1).getValue());
    }
}
