package com.mockito.unittesting.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest2 {

    List<String> mockList = mock(List.class);
@Test
public void test_return(){
    when(mockList.get(0)).thenReturn("1");
    assertEquals("1",mockList.get(0));
  }

    @Test
    public void test_return_(){
        when(mockList.get(anyInt())).thenReturn("1");
        assertEquals("1",mockList.get(10));
    }

    @Test
    public void test_verify(){
      String value1=mockList.get(0);
        String value2=mockList.get(1);

      verify(mockList).get(0);
      verify(mockList,times(2)).get(anyInt());
      verify(mockList,atLeast(1)).get(anyInt());//argument matcher
   //   verify(mockList,atLeast(1)).get(anyInt());//argument matcher
    }

}
