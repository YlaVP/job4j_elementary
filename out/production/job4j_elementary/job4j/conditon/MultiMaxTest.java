package ru.job4j.conditon;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(3, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(3,2,4);
        assertThat(result, is(4));

    }

    @Test
    public void whenFirstEqually() {
        int result = MultiMax.max(4,4,4);
    }
}