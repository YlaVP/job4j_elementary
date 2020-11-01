package ru.job4j.conditon;

public class SwitchWeek {
    public void nameOfDay(int day) {
        String name;
        int mondey;
        int tuesday;
        int wednesday;
        int thursday;
        int friday;
        int saturday;
        int sunday;
        switch (day) {
            case 1:
                mondey = 1;
                break;
            case 2:
                tuesday = 2;
                break;
            case 3:
                wednesday = 3;
                break;

            case 4:
                thursday = 4;
                break;
            case 5:
                friday = 5;
                break;
            case 6:
                saturday = 6;
                break;
            case 7:
                sunday = 7;
                break;

            default:
                name = "Неверные данные";

        }
    }
}