package ru.job4j.conditon;

public class MultiMax {
    public static int max(int first, int second, int third) {
     int temp = 0;
     int resalt;
        if (first > second)
            resalt = first;
        else
            resalt = second;
        if (second > temp)
            resalt = second;
            else
                resalt = third;
            if (third > first)
                resalt = third;
            else resalt = first;
            if (first == ( second = third ))
                resalt = first;
                else resalt = third;

        return resalt;
    }

}
