package com.mockito.unittesting.object;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapExample {

    public MyResultClass mapToMyResultClass(MyClassToMap myClassToMap) {
        List<MyResultInnerClass> myResultInnerClassList = myClassToMap.getMyClassInnerToMapList().stream()
                .map(myClassInnerToMap -> {
                    MyResultInnerClass myResultInnerClass = new MyResultInnerClass();
                    myResultInnerClass.setCode(myClassInnerToMap.getCode());
                    myResultInnerClass.setStreet(myClassInnerToMap.getStreet());
                    return myResultInnerClass;
                })
                .collect(Collectors.toList());

        return MyResultClass.builder()
                .name(myClassToMap.getName())
                .myResultInnerClassList(myResultInnerClassList)
                .build();
    }
}
