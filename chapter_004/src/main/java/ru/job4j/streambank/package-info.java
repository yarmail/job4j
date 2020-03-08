package ru.job4j.streambank;

/**
 * List of Bank accounts
 * Список банковских счетов
 * Реализовать коллекцию Map <User, List<Account>>,
 * обозначающую, что у каждого пользователя может быть
 * список банковских счетов.
 *
 * 	2. Тестовое задание из модуля коллекции Lite
 * 	переделать на Stream API.[#99023]
 */

/* Старые варианты методов */

/*
    public User getUserByPassport(String passport) {
        User result = null;
        Set<User> users = this.map.keySet();
        for (User i : users) {
            if (i.getPassport().equals(passport)) {
                result = i;
                break;
            }
        }
        return result;
    }
*/
