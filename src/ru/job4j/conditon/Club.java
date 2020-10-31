package ru.job4j.conditon;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        boolean can = hasMoney || beFriend;
        if (can) {
            System.out.println("I can go to the club.");
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
