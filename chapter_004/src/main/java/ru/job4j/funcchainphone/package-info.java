package ru.job4j.funcchainphone;
/**
 * Продолжаем работу над заданием Телефонный справочник
 * в задаче Функции высшего порядка [#24255]
 *
 * (на основе
 * 1. Телефонный справочник на базе ArrayList [#41598] 18.12.19
 * arrlistphonedict из 3 части)
 *
 * Частой задачей программиста является поиск данных в списках.
 * Поиск осуществляется через String.contains,
 * который позволяет находить поле по частичному набору символов
 *
 * Если я правильно понял задачу
 * то нужно создать цепочку предикатов и метод find сделать
 * стримом
 */

/*
Исходная версия метода find класса PhoneDictionary
Задача Вернуть список всех пользователей,
которые содержат key в любых полях

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>(0);
        for (Person person:persons) {
        if (person.getName().contains(key)
        ||  person.getSurname().contains(key)
        ||  person.getPhone().contains(key)
        ||  person.getAddress().contains(key)) {
        result.add(person);
        }
        }
        return result;
        }
*/