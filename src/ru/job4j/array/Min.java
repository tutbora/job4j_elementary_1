package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            /* проверить, что эталон больше, чем элемент.
            записать в эталон элемент массива. */

            // ниже представлены похожие решения

            // min = min < array[i] ? min : array[i];
            // min = Math.min(min, array[i]);

            min = min > array[i] ? array[i] : min;
        }
        return min;
    }
}