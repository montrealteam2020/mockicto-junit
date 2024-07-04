package com.mockito.unittesting.business;

import com.mockito.unittesting.data.SomeDataService;

import java.util.Arrays;
import java.util.OptionalInt;

public class SomeBusinessImpl {
    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    SomeDataService someDataService;
    public int calculateSum(int[] data){
     return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }

    public int calculateSumDataService(){
       int[] data =someDataService.retrieveAllData();
       return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }
}
