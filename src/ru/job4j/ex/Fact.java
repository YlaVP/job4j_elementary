package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
     int n = -1;

        System.out.println("fact" + calc(n));

    }


    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("the factorial cannot be a negative number.");
        }
            int rsl = 1;
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
    }



