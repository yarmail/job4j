package ru.job4j.streamphonebook;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Directory Model
 * Модель справочника
 * Поиск данных в списках.
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей,
     * которые содержат key в любых полях
     * переделать с использованием stream
     * @param key - ключ поиска
     * @return - список найденных пользователей
     */

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = (ArrayList<Person>) persons.stream().filter(
                person -> person.getAdress().contains(key)
                || person.getName().contains(key)
                || person.getPhone().contains(key)
                || person.getSurname().contains(key)
        ).collect(Collectors.toList());
        return result;
    }
}