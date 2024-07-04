package com.mockito.unittesting.spike;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class JsonPathTest {

    @Test
    public void learning(){
   String response="[{\"id\":1000,\"name\":\"Doe\",\"quantity\":12}," +
           "{\"id\":1001,\"name\":\"John\",\"quantity\":22}," +
           "{\"id\":1002,\"name\":\"Mama\",\"quantity\":22}" +
           "]";
      DocumentContext context= JsonPath.parse(response);
      int length = context.read("$.length()");
      assertThat(length).isEqualTo(3);
      List<Integer> ids = context.read("$..id");
      assertThat(ids).containsExactly(1000,1001,1002);

      System.out.println(context.read("$.[1]").toString());
      System.out.println(context.read("$.[0:1]").toString());
      System.out.println(context.read("$.[?(@.name=='John')]").toString());
        System.out.println(context.read("$.[?(@.quantity==22)]").toString());
    }
}
