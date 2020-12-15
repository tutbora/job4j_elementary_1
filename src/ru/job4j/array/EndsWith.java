package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return word[word.length - 1] == post[post.length - 1]
                && word[word.length - 2] == post[post.length - 2];
    }
}