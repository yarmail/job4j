package ru.job4j.exception;

/**
 * 0.2. Кидаем исключение - throw new RuntimeException [#219365]
 * Любая программа зависит от внешних ресурсов. Иногда возникает ситуация,
 * что программу начинают использовать не правильно.
 *
 * Сейчас она работает корректно.
 * + add(2, 10));
 *
 * Давайте переставим числа в вызове метода.
 * + add(10, 2));
 *
 * В этом случае программа будет работать бесконечно.
 * То есть программа работает не корректно.
 * В этой ситуации нужно добавить проверку входных параметров
 * и прервать выполнение программы, если данные введены не верно.
 *
 * Чтобы прервать выполнение программы, нужно использовать
 * оператор throw с передачей этому оператору объекта
 * типа java.util.Exception.
 *
 * Давайте доработаем нашу программу.
 * Перед int rsl = 0; добавлено
 * .
 * if (start > finish) {
 *      throw new IllegalArgumentException("Start should be less than finish.");
 * }
 * .
 * В Java есть встроенные классы, которые описывают
 * исключительные ситуации. Старайтесь не создавать
 * свои исключения, а использовать встроенные.
 * Это позволит другим программистам быстрее понять причину
 * возникновения проблемы.
 *
 * В конструкторе исключения нужно обязательно указать
 * причину возникновения исключения.
 * Никогда не оставляйте текст пустым.
 *
 * java.lang.IllegalArgumentException - метод вызывается
 * с некорректными параметрами.
 * java.lang.IllegalStateException - метод вызывается
 * с объекта в не корректном состоянии.
 *java.lang.NullPointerException - методы вызывается
 * у переменной, которая инициализирована null ссылкой.
 *
 * (задание в классе Fact)
 *
 * (сделаны тесты)
 */
public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int rsl = 0;
        for (int index = start; index != finish; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(10, 2));
    }
}
/*
вывод
Exception in thread "main" java.lang.IllegalArgumentException: Start should be less than finish.
 */
