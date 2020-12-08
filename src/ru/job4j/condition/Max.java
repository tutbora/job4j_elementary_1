package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result;
            if (left != right) {
                boolean condition = left > right;
                result = condition ? left : right;
            } else {
                result = right;
            }
        return result;
    }

    public static void main(String[] args) {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        System.out.println(result);
    }

}