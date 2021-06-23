package ru.job4j.argmethod;

/**
 * Так как никаких ограничений в решении задачи не указано,
 * только чтобы работало, одним из способов решения будет следующий
 * 1. Подправить структуру метода под 2 аргумента
 * 2. Убрать все вызовы метода, не соответствующие нашей структуре
 * (сигнатуре?)
 * Выглядет это должно примерно так
 */

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", возраст " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name, age);
    }
}