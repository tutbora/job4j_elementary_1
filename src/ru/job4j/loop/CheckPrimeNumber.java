package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int tempNum;
        if (number == 1) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                tempNum = i;
                if (number % tempNum == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}