package ru.job4j.array;

/**
 * The word begins with
 * 6.4. Слово начинается с ... [#41585] 02.04.20
 * Обертка над строкой.
 * реализация своими силами String.startsWith
 * self-realization String.startsWith
 */

public class ArrayChar {

    /**
     * Проверяет, что слово начинается с префикса.
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}