package ru.job4j.array;


public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl= data[0];
        for (boolean index : data) {
            if (rsl != index) {
                return false;
            }
        }
        return true;
    }


}


