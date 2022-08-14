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
    public static String message;
    private static char[] chars;
    private static final String[] STOP_WORDS = {"qwerty", "12345", "12345", "admin", "user"};

    public static String validate(String string) {
        password = string;
        if (string != null) {
            chars = password.toCharArray();
        }
        checkNull();
        checkLength();
        checkUpper();
        chekLower();
        checkDigit();
        checkSpecSymbol();
        checkStopWord();
        message = "Password is valid";
        return message;
    }

    private static void checkNull() {
        if (null == password) {
            message = "Password is null";
            makeException(message);
        }
    }

    private static void checkLength() {
        if (password.length() < 8 || password.length() > 32) {
            message = "Длина пароля должна находится в диапазоне [8, 32]";
            makeException(message);
        }
    }

    private static void checkUpper() {
        for (char symbol:chars) {
            if (Character.isUpperCase(symbol)) {
                return;
            }
        }
        message = "Пароль должен содержать хотя бы один символ в верхнем регистре";
        makeException(message);
    }

    private static void chekLower() {
        for (char symbol:chars) {
            if (Character.isLowerCase(symbol)) {
                return;
            }
        }
        message = "Пароль должен содержать хотя бы один символ в нижнем регистре";
        makeException(message);
    }

    private static void checkDigit() {
        for (char symbol:chars) {
            if (Character.isDigit(symbol)) {
                return;
            }
        }
        message = "Пароль должен содержать хотя бы одну цифру";
        makeException(message);
    }

    private static void checkSpecSymbol() {
        for (char symbol:chars) {
            if (!Character.isLetterOrDigit(symbol)) {
                return;
            }
        }
        message = "Пароль должен содержать хотя бы один спец. символ (не цифра и не буква)";
        makeException(message);
    }

    private static void checkStopWord() {
        String pass = password.toLowerCase(Locale.ROOT);
        for (String word: STOP_WORDS) {
            if (pass.contains(word)) {
                message = "Пароль не должен содержать стоп-слова";
                makeException(message);
                return;
            }
        }
    }

    private static void makeException(String message) {
        throw new IllegalArgumentException(message);
    }
}