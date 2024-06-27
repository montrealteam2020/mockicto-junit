package com.mockito.unittesting.controllers;

import com.mockito.unittesting.business.ItemsService;
import com.mockito.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;
   @MockBean
   private ItemsService itemServiceMock;
    @Test
    public void test_get_item() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/item")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"quantity\": 3,\"price\":2,\"id\":1,\"name\":\"pen\"}"))
                .andReturn();
       //JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), strict);
    }

    @Test
    public void test_get_all_item() throws Exception {
        when(itemServiceMock.retrieveAll()).thenReturn(new Item(2,"Bag",2,3));
        RequestBuilder request = MockMvcRequestBuilders.get("/all-items")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{quantity: 3,price:2,id:2,name:Bag}"))
                .andReturn();
         //JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), strict);
    }
   @Test
    public void test_get_all_item_from_db() throws Exception {
        when(itemServiceMock.retrieveAllItems()).thenReturn(Arrays.asList(new Item(3,"Bag",10,10),
                new Item(13,"T-Shirt",11,11)) );
        RequestBuilder request = MockMvcRequestBuilders.get("/get-all-items-db")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("[{quantity: 10,price:10,id:3,name:Bag}," +
                                                     "{quantity: 11,price:11,id:13,name:T-Shirt}]"))
                .andReturn();
        //JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), strict);
    }
}
