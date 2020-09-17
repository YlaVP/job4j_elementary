package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class Fit {

public static double manWeight(short height) {
    double rsl = (height - 100) * 1.15;
    return rsl;
}

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        short height1 = 164;
        double woman = ru.job4j.Fit.womanWeight(height1);
        System.out.println("Woman 164 is " + woman);
        System.out.println("Man 187 is " + man);
    }

}

