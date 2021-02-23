package ru.job4j.conditon;

public class MultiMax {
    public static int max(int first, int second, int third) {

        int temp = first > second ? first : second;

        int resalt = temp > third ? temp : third;

        return resalt;
    }

}
