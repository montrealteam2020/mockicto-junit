package com.mockito.unittesting.object;

import lombok.Data;

@Data
public class Address{
    public String street;
    public int number;

    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer(" Address {");
        sb.append(", street: ").append(street).append('\'');
        sb.append(", number: ").append(number).append('\'');
        return sb.toString();
    }
}