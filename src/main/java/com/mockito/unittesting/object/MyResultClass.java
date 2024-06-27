package com.mockito.unittesting.object;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class MyResultClass {
    String name;
    List<MyResultInnerClass> myResultInnerClassList;
}
