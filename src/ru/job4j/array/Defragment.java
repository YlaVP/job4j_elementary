package ru.job4j.array;


public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index + 1; /* указатель на null ячейку. */
                while (point < array.length && array[point] == null) {
                    point++;
                }
                if (point < array.length) {
                    swap(array, index, point);
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = array[notNullIndex];
        array[notNullIndex] = array[nullIndex];
        array[nullIndex] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
