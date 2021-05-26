package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key)
                return index;
        }

        return rsl;
    }

    public static void main(String[] args) {
        String[] arrayString = new String[]{"1", "2", "3", "4"};

        try {
            FindEl.indexOf(arrayString, "5");
            System.out.println("there is no such element");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();

        }
    }
}
