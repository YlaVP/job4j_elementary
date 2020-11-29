package ru.job4j.condition.point;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.condition.point.Point;

public class SqAreaTest {
    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = ru.job4j.condition.point.SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        double expected = 1;
        int p = 4;
        int k = 1;
        double out = ru.job4j.condition.point.SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    private static class SqArea {
    }
}