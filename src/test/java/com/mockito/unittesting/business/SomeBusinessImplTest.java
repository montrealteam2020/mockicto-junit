package com.mockito.unittesting.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {

    @Test
    public void calculateSum_basic(){
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
        int actualResult = someBusinessImpl.calculateSum(new int[]{1,2,3});
        int expectedResult=6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
        int actualResult = someBusinessImpl.calculateSum(new int[]{});
        int expectedResult=0;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSum_one(){
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
        int actualResult = someBusinessImpl.calculateSum(new int[]{3});
        int expectedResult=3;
        assertEquals(expectedResult,actualResult);
    }
}
