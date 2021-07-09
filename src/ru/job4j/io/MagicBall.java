package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Будет ли завтра дождь?");
        String question = input.nextLine();
        System.out.println(answer(new Random().nextInt(3)));
    }
    public static String answer(int ans){
        String result = "Может быть";
        if (ans == 0) {
            result = "Да";
        }  else if (ans == 1) {
                result = "Нет";
                    }
        return result;
    }
}

