package com.mockito.unittesting.object;

import lombok.Data;

import java.util.List;
@Data
public class MyClassToMap {
String name;
    List<MyClassInnerToMap> myClassInnerToMapList;
}
