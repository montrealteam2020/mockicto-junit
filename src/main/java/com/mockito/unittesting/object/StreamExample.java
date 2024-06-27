package com.mockito.unittesting.object;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StreamExample {

    public MyResultClass mapToMyResultClass(MyClassToMap myClassToMap){
             List<MyResultInnerClass> myResultInnerClassList = new ArrayList<>();

             for(MyClassInnerToMap myClassInnerToMap: myClassToMap.getMyClassInnerToMapList())
             {
                 MyResultInnerClass myResultInnerClass = new MyResultInnerClass();
                 myResultInnerClass.setCode(myClassInnerToMap.getCode());
                 myResultInnerClass.setStreet(myClassInnerToMap.getStreet());
                 myResultInnerClassList.add(myResultInnerClass);
             }

             return MyResultClass.builder()
                     .name(myClassToMap.getName())
                     .myResultInnerClassList(myResultInnerClassList).build();

    }

}
