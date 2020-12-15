package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        return pref[0] == word[0] && pref[1] == word[1];
    }
}