package com.mockito.unittesting.business;

import com.mockito.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @InjectMocks
    SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
   @Mock
   SomeDataService someDataServiceMock=  mock(SomeDataService.class);

    @Test
    public void calculateSumDataService_basic(){
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});
        int actualResult = someBusinessImpl.calculateSumDataService();
        int expectedResult=6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
        SomeDataService someDataServiceMock=  mock(SomeDataService.class);
        someBusinessImpl.setSomeDataService(someDataServiceMock);
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int actualResult = someBusinessImpl.calculateSumDataService();
        int expectedResult=0;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSum_one(){

        SomeDataService someDataServiceMock=  mock(SomeDataService.class);
        someBusinessImpl.setSomeDataService(someDataServiceMock);
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[]{3});
        int actualResult = someBusinessImpl.calculateSumDataService();
        int expectedResult=3;
        assertEquals(expectedResult,actualResult);
    }
}
