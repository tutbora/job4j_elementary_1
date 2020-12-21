package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0, j = 0;
        money = money - price;
        while (money > 0) {
            for (; money >= coins[size]; j++) {
                money = money - coins[size];
                rsl[j] = coins[size];
            }
            size++;
        }
        size = j;
        int[] ints = Arrays.copyOf(rsl, size);
        return ints;
    }
}