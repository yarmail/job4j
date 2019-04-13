package ru.job4j.condition;
public class DummyBot {
    /**
     * Answer method answers questions
     * метод answer отвечает на вопросы
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