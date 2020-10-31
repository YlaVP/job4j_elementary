package ru.job4j.conditon;


public class Max {

    public static String max(int left, int right) {

        String result = left <= right ? left > right ? "left" : "right": "left max" ;

        return result;
    }
}

