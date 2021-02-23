package ru.job4j.condition.point;

public class DummyBot {


    public static String answer(String question) {
        String resalt = "Это ставит меня в тупик. Задайте другой вопрос.";

        if ("Привет, Бот.".equals(question)) {
          resalt = "Привет, умник.";
        } else if ("Пока".equals(question))
           resalt = "До скорой встречи";

        return resalt;
    }
    public static void main(String[] args) {
        String resalt = DummyBot.answer("Привет, Бот");
        System.out.println(resalt);
        resalt = DummyBot.answer("Пока.");
        System.out.println(resalt);
    }
}


