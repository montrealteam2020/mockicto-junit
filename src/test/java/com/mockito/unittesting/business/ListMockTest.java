package com.mockito.unittesting.business;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {
    List listMock = mock(List.class);
    @Test
    public void test_list_size(){

        when(listMock.size()).thenReturn(2).thenReturn(10);
        assertEquals(2,listMock.size());
        assertEquals(10,listMock.size());
    }

    @Test
    public void test_value(){
        when(listMock.get(0)).thenReturn("GoodMorning");
        assertEquals("GoodMorning",listMock.get(0));

    }

    @Test
    public void test_any_value(){
        when(listMock.get(anyInt())).thenReturn("GoodMorning");
        assertEquals("GoodMorning",listMock.get(0));

    }
}
