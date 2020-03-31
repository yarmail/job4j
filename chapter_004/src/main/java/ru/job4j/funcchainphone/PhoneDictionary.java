package ru.job4j.funcchainphone;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * В этой версии телефонного справочника
 * Функции высшего порядка
 * Цепочки предикатов
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей,
     * которые содержат key в любых полях
     *
     * @param key - ключ поиска
     * @return - список найденных пользователей
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> p1 = i -> i.getAddress().contains(key);
        Predicate<Person> p2 = i -> i.getName().contains(key);
        Predicate<Person> p3 = i -> i.getPhone().contains(key);
        Predicate<Person> p4 = i -> i.getSurname().contains(key);

        return persons.stream()
                .filter(p1.or(p2).or(p3).or(p4))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
