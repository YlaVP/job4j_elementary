package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calculator(a, b, c, x);
        System.out.println(rsl);

        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calculator(a, b, c, x);
        System.out.println(rsl);

        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then0() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calculator(a, b, c, x);
        System.out.println(rsl);

        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then0() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calculator(a, b, c, x);
        System.out.println(rsl);

        Assert.assertEquals(expected, rsl);
    }

    @Test

    public void whenA1B1C1X0Then0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calculator(a, b, c, x);
        System.out.println(rsl);

        Assert.assertEquals(expected, rsl);
    }

}