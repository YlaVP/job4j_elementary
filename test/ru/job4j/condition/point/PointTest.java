package ru.job4j.condition.point;

import org.junit.jupiter.api.Test;
import ru.job4j.condition.point.Point;

import static org.junit.Assert.*;
import static ru.job4j.condition.point.Point.distance;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to10then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 0;
        double out = distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to10then1() {
        int expected = 1;
        int x1 = 2;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double out = distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}