package ru.job4j.array;

/**
 * 6.4.2. Слово заканчивается на ... [#156317]
 * (есть тесты)
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length - 1; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}