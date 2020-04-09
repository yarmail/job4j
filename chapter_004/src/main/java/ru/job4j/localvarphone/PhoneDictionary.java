package ru.job4j.localvarphone;

import java.util.ArrayList;

/**
 * Directory Model
 * Модель справочника
 * Поиск данных в списках.
 *
 * Использовать Local Variable Type Inference из
 * Java 10
 */
public class PhoneDictionary {
    // как я понимаю var c private и в полях класса не работает
    private ArrayList<Person> persons = new ArrayList<>(0);

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей,
     * которые содержат key в любых полях
     * @param key - ключ поиска
     * @return - список найденных пользователей
     */
    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>(0);
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


}
