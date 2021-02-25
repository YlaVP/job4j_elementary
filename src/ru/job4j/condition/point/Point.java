package ru.job4j.condition.point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public double distance3d(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2) + pow(this.z - another.z, 2));
    }

    public static void main(String[] args) {
        Point one = new Point(0, 0);
        Point two = new Point(0, 2);
        double distance = one.distance(two);
        System.out.println(distance);
    }
}





