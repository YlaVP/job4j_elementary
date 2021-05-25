package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.ex.Fact.calc;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactLessThenZero() {
        Fact.calc(-1);
    }
}