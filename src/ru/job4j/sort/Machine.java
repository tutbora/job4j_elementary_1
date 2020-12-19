package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (money >= price) {
                money = money - price;
            }
            if (money >= coins[size]){
                rsl[i] = coins[size];
                money = money - coins[size];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}