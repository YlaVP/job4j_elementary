package loop;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity");
            index = index; //либо так, добавить +1, чтобы не было вечного цикла либо -1 не указывать
        }
    }

}
