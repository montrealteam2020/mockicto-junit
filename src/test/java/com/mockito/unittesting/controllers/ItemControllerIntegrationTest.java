package com.mockito.unittesting.controllers;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerIntegrationTest {
   @Autowired
    private TestRestTemplate testRestTemplate;

   @Test
    public void contextTest() throws JSONException {
      String result=testRestTemplate.getForObject("/get-all-items-db",String.class);
       JSONAssert.assertEquals("[{id:1000},{id:1001},{id:1002}]",result,false);
   }
}
