package ru.job4j.conditon;

public class SwitchWeek {
    public void nameOfDay(int day) {
        String name;
               switch (day) {
            case 1:
               name = "Mondey";               ;
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;

            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
               name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;

            default:
                name = "Неверные данные";

        }
    }
}