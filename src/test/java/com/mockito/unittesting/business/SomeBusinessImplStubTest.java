package com.mockito.unittesting.business;

import com.mockito.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeDataServiceImpl implements SomeDataService {


    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}

class SomeDataServiceImplEmpty implements SomeDataService {


    @Override
    public int[] retrieveAllData() {
        return new int[]{};
    }
}
public class SomeBusinessImplStubTest {

    @Test
    public void calculateSumDataService_basic(){
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
        someBusinessImpl.setSomeDataService(new SomeDataServiceImpl());
        int actualResult = someBusinessImpl.calculateSumDataService();
        int expectedResult=6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
        someBusinessImpl.setSomeDataService(new SomeDataServiceImplEmpty());
        int actualResult = someBusinessImpl.calculateSumDataService();
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
