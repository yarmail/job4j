package ru.job4j.arrlistphonedict;

import java.util.ArrayList;

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
     * @param key - ключ поиска
     * @return - список найденных пользователей
     */
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


}
