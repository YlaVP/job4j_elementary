package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
    int result = Factorial.calc(5);
    int expected = 120;
    assertThat(result, is(expected));


    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));

    }
}
