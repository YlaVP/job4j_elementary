package ru.job4j.conditon;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            if (x1 >= 0 && x2 <= 7){
                if (y2 >= 0 && y1 <= 7){

                }
            }
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }
}