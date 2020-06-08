package ru.job4j.funcfilter;


/**
 * Using built-in functional interfaces
 * Использование встроенных функциональных интерфейсов
 *
 *
 *
 * Встроенные функциональные интерфейсы. [#249209]
 *
 * Есть
 * фильтрация списка без применения
 * встроенных функциональных интерфейсов
 * class FilterOld
 *
 * Нужно
 * выбрать подходящий функциональный интерфейс
 * и создать универсальный фильтр
 * class Filter
 *
 * Тестирование обоих класов
 * class FilterTest
 *
 */

/*
Альтернативный вариант использования
нескольких условий в классе

    public ArrayList<Person> find(String key) {

        Predicate<Person> pred1 = i -> i.getAddress().contains(key);
        Predicate<Person> pred2 = i -> i.getName().contains(key);
        Predicate<Person> pred3 = i -> i.getPhone().contains(key);
        Predicate<Person> pred4 = i -> i.getSurname().contains(key);
        List<Predicate<Person>> predicates = Arrays.asList(pred1, pred2, pred3, pred4);

        return persons.stream()
                .filter(predicates.stream().reduce(i -> false, Predicate::or))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

 */
