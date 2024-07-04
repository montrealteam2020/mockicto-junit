package com.mockito.unittesting.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(value=UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void test_add_user() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/add")
                                                       .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                                  .andExpect(status().isOk())
                                  .andExpect(content().string("user added"))
                                  .andReturn();
        assertEquals("user added",result.getResponse().getContentAsString());
    }

   // @Test
    public void test_post_request() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/items")
                .accept(MediaType.APPLICATION_JSON)
                .content("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}")
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isCreated())
                .andExpect(header().string("location",containsString("/item/"))).andReturn();

    }

}
