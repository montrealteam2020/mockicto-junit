package com.mockito.unittesting.spike;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {

    @Test
    public void learning(){
        List<Integer> data = Arrays.asList(12,24,45);

      //  assertThat(data,hasSize(3));
        assertThat(data).hasSize(3).contains(12,45)
                .allMatch(x->x>10)
                .allMatch(x->x<100)
                .noneMatch(x->x<0);
      //  assertThat(data, hasItems(12,45));
     //   assertThat(data, hasItem(24));
       // assertThat(data,everyItem(greaterThan(10)));
     //   assertThat(data,everyItem(lessThan(100)));
        assertThat("").isEmpty();
        assertThat("ABCD").contains("BC")
                .startsWith("AB")
                .endsWith("CD");
    //    assertThat("", isEmptyString());
     //   assertThat("ABCD", containsString("BC"));
    //    assertThat("ABCD", endsWith("CD"));
     //   assertThat("ABCD", startsWith("ABC"));
    }
}
