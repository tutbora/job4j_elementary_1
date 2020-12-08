package ru.job4j.temp;
/*
объявили А, B, C;

        if (А > B)
        if (A > C) напечатать A;

        if (B > A)
        if (B > C) напечатать B;

        if (C > A)
        if (C > B) напечатать C;

        закончить программу;
*/

public class ExampleTemp001 {

    public static int tempExample(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        }
        if (b > a) {
            if (b > c) {
                return b;
            }
        }
        if (c > a) {
            if (c > b) {
                return c;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 15, b = 12, c = 20;
        int result = ExampleTemp001.tempExample(a, b, c);
        System.out.println(result);
    }
}