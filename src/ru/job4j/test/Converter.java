package ru.job4j.test;

public class Converter {

    public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60;
            return rsl;
        }

    public static void main(String[] args) {
        int in = 140;
        int in2 = 240;
        int expected = 2;
        int expected2 = 4;
        int out = Converter.rubleToEuro(in);
        int out2 = Converter.rubleToDollar(in2);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("240 rubles are 4 dollara. Test result : " + passed2);
    }

}