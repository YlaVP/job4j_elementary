package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value1) {
        int rsl1 = value1 / 70;
        return rsl1;

    }

    public static int rubleToDollar(int value2) {
        int rsl2 = value2 / 60;
        return rsl2;

    }

    public static void main(String[] args) {
        double euro = 1.0 / 70.0;
        int value1 = 1;

        double dol = 1.0 / 60.0;
        int value2 = 1;
        System.out.println(" euro = " + euro);
        System.out.println("dol = " + dol);


    }
}



