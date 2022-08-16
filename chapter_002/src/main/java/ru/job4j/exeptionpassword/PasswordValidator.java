package ru.job4j.exeptionpassword;

import java.util.Locale;

/**
 * 4. Принципы раннего возврата и охранных выражений [#504875]
 * 1. Создать класс PassportValidator, который занимается проверкой пароля:
 * 2. Добавить валидацию в метод validate(), применив принцип охранных выражений. Если password null, то выбросить исключение IllegalArgumentException;
 * 3. Учесть требования к паролю ниже. Если хотя бы одно из требований нарушается, то возвращать нужно соответствующее сообщение:
 * 1) Длина пароля находится в диапазоне [8, 32];
 * 2) Пароль содержит хотя бы один символ в верхнем регистре;
 * 3) Пароль содержит хотя бы один символ в нижнем регистре;
 * 4) Пароль содержит хотя бы одну цифру;
 * 5) Пароль содержит хотя бы один спец. символ (не цифра и не буква);
 * 6) Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user. Без учета регистра, значит что, например, ни qwerty ни QWERTY ни qwErty и т.п. быть не должно быть в составе пароля.
 * Для проверок использовать статические методы класса Character.
 * 4. Создать класс PasswordValidatorTest. Реализовать Unit тесты, которые учитывают все условия, реализованные в методе validate();
 * (есть тесты)
 */
public class PasswordValidator {
    private static String password;
    private static char[] chars;
    private static final String[] INVALID_WORDS = {"qwerty", "12345", "12345", "admin", "user"};

    public static String validate(String string) {
        password = string;
        if (string != null) {
            chars = password.toCharArray();
        }
        checkNull();
        checkLength();
        checkUpperCaseChar();
        chekLowerCaseChar();
        checkDigit();
        checkSpecSymbol();
        checkInvalidWord();
        return "Password is valid";
    }

    private static void checkNull() {
        if (null == password) {
            makeException("Password is null");
        }
    }

    private static void checkLength() {
        if (password.length() < 8 || password.length() > 32) {
            makeException("Длина пароля должна находится в диапазоне [8, 32]");
        }
    }

    private static void checkUpperCaseChar() {
        boolean found = false;
        for (char symbol : chars) {
            if (Character.isUpperCase(symbol)) {
                found = true;
                break;
            }
        }
        if (!found) {
            makeException("Пароль должен содержать хотя бы один символ в верхнем регистре");
        }
    }

    private static void chekLowerCaseChar() {
        boolean found = false;
        for (char symbol : chars) {
            if (Character.isLowerCase(symbol)) {
                found = true;
                break;
            }
        }
        if (!found) {
            makeException("Пароль должен содержать хотя бы один символ в нижнем регистре");
        }
    }

    private static void checkDigit() {
        boolean found = false;
        for (char symbol : chars) {
            if (Character.isDigit(symbol)) {
                found = true;
                break;
            }
        }
        if (!found) {
            makeException("Пароль должен содержать хотя бы одну цифру");
        }
    }

    private static void checkSpecSymbol() {
        boolean found = false;
        for (char symbol : chars) {
            if (!Character.isLetterOrDigit(symbol)) {
                found = true;
                break;
            }
        }
        if (!found) {
            makeException("Пароль должен содержать хотя бы один спец. символ (не цифра и не буква)");
        }
    }

    private static void checkInvalidWord() {
        String pass = password.toLowerCase(Locale.ROOT);
        for (String word : INVALID_WORDS) {
            if (pass.contains(word)) {
                makeException("Пароль не должен содержать некоторые слова");
                break;
            }
        }
    }

    private static void makeException(String message) {
        throw new IllegalArgumentException(message);
    }
}