package com.mockito.unittesting.spike;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

    @Test
    public void learning(){
        List<Integer> data = Arrays.asList(12,24,45);

        assertThat(data,hasSize(3));
        assertThat(data, hasItems(12,45));
        assertThat(data, hasItem(24));
        assertThat(data,everyItem(greaterThan(10)));
        assertThat(data,everyItem(lessThan(100)));

        assertThat("", isEmptyString());
        assertThat("ABCD", containsString("BC"));
        assertThat("ABCD", endsWith("CD"));
        assertThat("ABCD", startsWith("ABC"));
    }
}
