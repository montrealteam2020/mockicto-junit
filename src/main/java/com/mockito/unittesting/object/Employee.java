package com.mockito.unittesting.object;

import lombok.Data;

import java.util.List;

@Data
public class Employee {
    public String name;
    public int age;
    public List<Address> addresses;

    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer(" Employee {");
        sb.append(", name: ").append(name).append('\'');
        sb.append(", age: ").append(age).append('\'');
        sb.append(", addresses: ").append(addresses).append('\'');
      return sb.toString();
    }

}
