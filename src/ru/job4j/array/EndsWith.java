package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        boolean result = false;
        for (int i = 1; i <= post.length; i++) {
            if (word[word.length - i] == post[post.length - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}