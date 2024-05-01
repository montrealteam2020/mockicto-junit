package com.mockito.unittesting.business;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
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
      verify(mockList,atMost(2)).get(anyInt());//argument matcher
      verify(mockList,never()).get(2);//argument matcher
    }


    @Test
    public void argument_capture(){
    mockList.add("someThing");
    ArgumentCaptor<String> capture = ArgumentCaptor.forClass(String.class);
    verify(mockList).add(capture.capture());
    assertEquals("someThing",capture.getValue());

    }
    @Test
    public void argument_capture_multiple(){
    mockList.add("Argument1");
    mockList.add("Argument2");
    ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    verify(mockList,times(2)).add(captor.capture());
    List<String> result = captor.getAllValues();
    assertEquals("Argument1",result.get(0));
    assertEquals("Argument2",result.get(1));
    }

    @Test
    public void argument_mock(){
        ArrayList<String> arrayListMock= mock(ArrayList.class);
        System.out.println(arrayListMock.get(0));
        System.out.println(arrayListMock.size());
        arrayListMock.add("Test");
        System.out.println(arrayListMock.get(0));
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());

    }
    @Test
    public void argument_spy(){
        ArrayList<String> arrayListSpy= spy(ArrayList.class);
        System.out.println(arrayListSpy.size());
        when(arrayListSpy.size()).thenReturn(5);
        assertEquals(5,arrayListSpy.size());
    }
}
