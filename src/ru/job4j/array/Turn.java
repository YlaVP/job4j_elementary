package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int index = array.length - 1;

        for (int i = 0; i <= index; i++ ) {
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            index--;
        }

        return array;
    }
}
