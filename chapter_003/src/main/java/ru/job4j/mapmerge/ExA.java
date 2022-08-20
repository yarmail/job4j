package ru.job4j.mapmerge;

import java.util.HashMap;
import java.util.Map;

/**
 * Пример 1 работы Map.merge
 */
public class ExA {

    /**
     * Если в вашей Map ключ key не существует
     * или value для этого ключа равно null,
     * метод добавляет в Map переданную пару
     * key-value
     *
     * Если ключ Key существует и его value != null -
     * метод меняет его value на результат переданной
     * функции remappingFunction
     *
     * Если remappingFunction возврщает null -
     * key удаляется из коллекции
     */
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");

        books.merge("Философия Java", "Брюс Эккель", (a, b) -> b + " и кто-то там ещё");
        books.forEach((a, b) -> System.out.println("Название" + a + ". Автор: " + b));
    }
}