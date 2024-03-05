package com.mockito.unittesting.business;

import com.mockito.unittesting.data.SomeDataService;

public class SomeBusinessImpl {
    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    SomeDataService someDataService;
    public int calculateSum(int[] data){
        int sum=0;
        for(int value:data){
            sum+=value;
        }
        return sum;
    }

    public int calculateSumDataService(){
        int sum=0;
       int[] data =someDataService.retrieveAllData();
        for(int value:data){
            sum+=value;
        }
        return sum;
    }
}
