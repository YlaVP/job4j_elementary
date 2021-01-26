package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = 0; i < el; i++) {
            int index = 0;
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
