package com.mockito.unittesting.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

}
