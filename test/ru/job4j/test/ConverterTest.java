package ru.job4j.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);

        }

        @Test

        public void whenConvert0RblThen3Dlr() {
            int in1 = 0;
            int expected2 = 3;
            int out3 = Converter.rubleToDollar(in1);
            Assert.assertEquals(expected2, out3);
        }

    }


