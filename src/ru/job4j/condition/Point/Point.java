package ru.job4j.condition.Point;

import ru.job4j.Main;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       double aс = x2 - x1;
       double сb = y2 - y1;
       double ac = Math.pow(x2, x1);
       double cb = Math.pow(y2, y1);
       double c = ac + cb;
       double d = Math.sqrt(c);
       double rsl = d;
       return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}










