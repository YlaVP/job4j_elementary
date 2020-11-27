package ru.job4j.loop;


public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        var powerIvan = ivan;
        var powerNik = nik;
        while (powerIvan < powerNik) {
            powerIvan *= 3;
            powerNik *= 2;
            month++;
        }
            return month;
    }

}




