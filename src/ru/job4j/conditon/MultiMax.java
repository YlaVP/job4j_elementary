package ru.job4j.conditon;

public class MultiMax {
    public static int max(int first, int second, int third) {

    int temp = first > second && first > third ? first : third;
    int temp1 = second > third ? second : third;
    int rsl = temp > temp1 ? temp : temp1;
    return  rsl;
    }

}
