package ru.job4j.classandobject;

/**
 * Количество аргументов в методах может быть разным.
 * Рассмотрим класс MethodArg.
 * В этом классе есть метод hello.
 * Он принимает один аргумент с типом String.
 * Метод, объявленный с аргументом,
 * может быть выполнен, только если в него передадут аргумент
 * Вызов метода с указанием двух аргументов не сработает
 * Вызав методва с указанием другого типа аргумента не сработает
 */
public class MethodArg {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        MethodArg.hello(name);
        // MethodArg.hello(name, age) - ошибка
        // MethodArg.hello(age (int)) - ошибка
    }
}
