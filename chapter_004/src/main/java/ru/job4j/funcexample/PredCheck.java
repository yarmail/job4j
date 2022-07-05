package ru.job4j.funcexample;

import java.util.function.Predicate;

/**
 * 2.3. Встроенные функциональные интерфейсы. [#249209]
 * Давайте рассмотрим следующий пример –
 * у нас есть класс, который работает со строками:
 * т.е. у нас есть класс и в нем определены 3 метода,
 * которые выполняют проверки над строкой.
 * Мы можем заметить, что у всех методов есть общее –
 * все три метода возвращают один и тот же тип – boolean.
 * Мы помним, что метод test интерфейса Predicate возвращает тип boolean
 * – давайте перепишем наш код, создав метод, который будет принимать
 * Predicate и выполняет проверки с нашими строками:
 *
 * (как я понимаю, если мы находим общие черты у операций,
 * мы можем попробовать их объединить функциональным интерфейсом)
 *
 */
public class PredCheck {
    public boolean empty(String s) {
        return check(String::isEmpty, s);
    }

    public boolean startWith(String s, String pref) {
        return check(str -> str.startsWith(pref), s);
    }

    public boolean contains(String s, String key) {
        return s.contains(key);
    }

    /**
     * Добавляем новый метод,
     * как я понимаю модель (интерефейс)?? проверки
     * Теперь остальные можно удалить
     */
    public boolean check(Predicate<String> predicate, String string) {
        return predicate.test(string);
    }

    /**
     * Проверяем работу обновленного класса
     *
     */
    public static void main(String[] args) {
        PredCheck usage = new PredCheck();
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );
    }
}

/*
Было
public class StrategyUsage {
    public boolean empty(String s) {
        return s.isEmpty();
    }

    public boolean startWith(String s, String pref) {
        return s.startsWith(pref);
    }

    public boolean contains(String s, String key) {
        return s.contains(key);
    }
}
 */