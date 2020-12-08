package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            if (first > third) {
                result = first;
            }
        } else if (second > first) {
            if (second > third) {
                result = second;
            }
        }
        if (third > first) {
            if (third > second) {
                result = third;
            }
        } else if (first == second && third == second) {
                result = first;
        }
        return result;
    }
}