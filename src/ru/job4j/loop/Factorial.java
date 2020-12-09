package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0, divFactorial = 0;
        for (int i = divFactorial; i <= n; i++) {
            result = divFactorial == 0 ? result + 1 : result * divFactorial;
            divFactorial++;
        }
        return result;
    }
}