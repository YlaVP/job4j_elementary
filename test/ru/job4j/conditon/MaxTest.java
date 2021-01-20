package ru.job4j.conditon;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;


public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        String result = Max.max(1, 2);
        assertThat(result, is(2));

    }

    @Test
    public void whenMax2To1Then1() {
        String result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1() {
        String result = Max.max(1, 2);
        assertThat(result, is(1));
    }
}

   