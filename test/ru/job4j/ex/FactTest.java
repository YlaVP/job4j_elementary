package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.ex.Fact.calc;

public class FactTest {

  @Test(expected = IllegalArgumentException.class)
    public void whenFactLessThenZero() {
      int rsl = Fact.calc(-1);
      assertThat(rsl, is(-1));


  }
}