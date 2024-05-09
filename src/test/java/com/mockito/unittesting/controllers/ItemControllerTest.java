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
       // JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), strict);
    }

    @Test
    public void test_get_all_item() throws Exception {
        when(itemServiceMock.retreiveAll()).thenReturn(new Item(2,"Bag",2,3));
        RequestBuilder request = MockMvcRequestBuilders.get("/all-items")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{quantity: 3,price:2,id:2,name:Bag}"))
                .andReturn();
        // JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), strict);
    }
}
