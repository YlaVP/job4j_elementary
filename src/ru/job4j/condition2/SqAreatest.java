package ru.job4j.condition2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SqAreatest {
    @Test

    public void square() {
        int expected = 162;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        int expected = 1600;
        int p = 8;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}




