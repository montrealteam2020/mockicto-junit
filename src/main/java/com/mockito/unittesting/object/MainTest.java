package com.mockito.unittesting.object;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
public class MainTest {

    public static void main(String[] args) {
        Employee em = new Employee();
        Address add = new Address();
       em.setName("ABCD");
       em.setAge(35);
List<Address> addressList = new ArrayList<>();
        add.setStreet("Street 1");
        add.setNumber(1111);
        em.setAddresses(addressList);
        em.getAddresses().add(add);

        add = new Address();

        add.setStreet("Street 2");
        add.setNumber(2222);
        em.getAddresses().add(add);

        log.info("employee {}",em.toString());

    }
}
