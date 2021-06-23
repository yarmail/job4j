package ru.job4j.argmethod;

/**
 *
 * 4.1. Аргументы [#295521]
 *
 * Количество аргументов в методах может быть разным.
 * Какие возможны ситуации:
 * - забыли указать аргумент
 * - вызываем метод с лишним аргументом
 * - Перепутан тип аргумента
 */

/* Задание
1. Ниже приведен код с ошибками.
Ваша задача поправить код, чтобы он компилировался.

package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }
}
*/
