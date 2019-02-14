package ru.job4j.condition;

/*
Program Dummy Bot answers questions
Программа Глупый Бот отвечает на вопросы
 */

public class DummyBot {
    /**
     * отвечает на вопросы
     * @param question Вопрос от клиента.
     * @return rsl Ответ.
     */

    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}