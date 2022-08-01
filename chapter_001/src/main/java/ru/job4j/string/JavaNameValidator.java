package ru.job4j.string;

/**
 * 6.9. String - это массив [#504884]
 * 1. Необходимо разработать метод для
 * проверки валидности имен в языке Java.
 * Напомню, что переменные может содержать
 * символы латинского алфавита и числа,
 * символ подчеркивания и символ доллара.
 * Переменная должна начинаться на строчную латинскую букву.
 *
 * (есть тесты)
 */
public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        return name.matches("^[a-z][a-zA-Z0-9_$]{0,}");
    }
}
/*
Расшифровка
^[a-z]
первый символ любой латинский мелкий

[a-zA-Z0-9_$]{0,} -
следующие символы (от 0 и более)
могут быть из диапазонов
a-z, A-Z, 0-9 и знаков "_" и "$"

 */

/* Альтернативный вариант
public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] symbols = name.toCharArray();
        if (symbols[0] < 'a' || symbols[0] > 'z') {
            return false;
        }

        for (int i = 1; i < symbols.length; i++) {
            if (!isCorrectSymbol(symbols[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCorrectSymbol(char symbol) {
        return symbol >= 'a' && symbol <= 'z'
                || symbol >= '0' && symbol <= '9'
                || symbol == '_'
                || symbol == '$';
    }
}
 */
