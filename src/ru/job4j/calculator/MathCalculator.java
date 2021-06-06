package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double allArithmeticOperations(double first, double second) {
        return sumAndMultiply(first, second) + multiply(first, second) + difference(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20) +
                "\nРезультат расчета суммы разности и деления равен: " + differenceAndDivision(10, 20) +
                "\nРезультат расчета всех операций равен: " + allArithmeticOperations(10, 20)
        );
    }

}
