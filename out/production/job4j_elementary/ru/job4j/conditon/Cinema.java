package ru.job4j.conditon;

public class Cinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        boolean can = allowByParent && hasMoney;
        if ( can ) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}

