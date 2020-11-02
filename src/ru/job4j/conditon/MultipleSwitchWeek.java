package ru.job4j.conditon;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        return switch (name) {
            case  "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> -1;
        };
    }
}









