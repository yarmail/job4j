package ru.job4j;

import org.junit.Test;

/**
 * Вводим данный класс для отработки отдельных вопросов
 * по базовому синтаксису Java
 */

public class BaseSyntHunt4 {

    /**
     * Чему будет равно число a?
     * int a = (byte)(-128 - 1);
     * Ответ:127
     * Пояснение: значения byte используются по кругу
     */
    @Test
    public void aTest() {
        int a = (byte) (-128 - 1);
        System.out.println(a);
    }

    /**
     * Сложение строк line addition
     * Какая итоговая строка получится в выражении: 1 + 2 + " " + 3 + 4?
     * ответ:3 34
     * Пояснение: Если только одно выражение операнда имеет тип String,
     * тогда преобразование строки (§5.1.11 (https:(две косые черты)docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.11 ))
     * выполняется для другого операнда для получения строки во время выполнения.
     */
    @Test
    public void lineAddition() {
        System.out.println(1 + 2 + " " + 3 + 4);
    }

    /**
     * Форматирование строк
     * Что будет выведено на печать в следующем примере:
     * System.out.printf("%s%s,I am %d years old", "boy", "Hello", 12);
     * Hello boy, I am 12 years old
     * boy Hello,I am 12 years old
     * Helloboy,I am 12 years old
     * V    boyHello,I am 12 years old
     * Hello12,I am boy years old
     */
    @Test
    public void formatString() {
        System.out.printf("%s%s,I am %d years old", "boy", "Hello", 12);
    }

    /**
     * n8 Passing parameters
     * Передача параметров
     * Что будет выведено на консоль?
     * Dog Cat Kotov
     * DogCat Kotov
     * Cat Kotov
     * V  Dog Kotov
     * Dog Cat
     */
    @Test
    public void passingParameters() {
        String name = "Dog";
        change(name);
        System.out.println(name);
        name = change(name);
        System.out.println(name);
    }

    public static String change(String name) {
        name = name + "Сat";
        String surname = "Kotov";
        return surname;
    }

    /**
     * Найдите все ошибки в следующем примере,
     * приложение должно печатать в консоли числа от 1-го до 5-ти:
     * i должно начинаться с 0
     * В System.out.println в скобках надо указать i++
     * V    В System.out.println в скобках надо указать i
     * V    В логическом выражении нужно написать i <= 5
     * В логическом выражении нужно написать i < 5
     * В логическом выражении нужно написать i > 5
     */
    @Test
    public void cycleMistake() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    /**
     * Что будет выведено на консоли? Передача параметра ссылочного типа.
     * v     1
     * 2
     * Программа выкинет ошибку.
     */

    @Test
    public void linkValue() {
        Integer value = 1;
        this.change(value);
        System.out.println(value);
    }

    public void change(Integer value) {
        ++value;
    }

    /**
     * Что будет выведено на консоли? Передача примитивного типа.
     * 11
     * V    12
     * 23
     * Программа упадет с ошибкой.
     */
    @Test
    public void primitiveValue() {
        int value = 1;
        this.change(value);
        System.out.print(value);
        ++value;
        System.out.println(value);
    }

    public void primitivechange(int value) {
        ++value;
    }

    /**
     * 27. Что вернет метод? Тернарное условие.
     * "great"
     * Программа упадет с ошибкой.
     * V     "less"
     * 1
     */
    @Test
    public void ternaryCondition() {
        int left = 1;
        int right = 1;
        String result = left > right ? "great" : "less";
        System.out.println(result);
    }

    /**
     * Сколько раз напечатается слово "Hello" в консоли? Вложенные циклы.
     * 10
     * V    15
     * 5
     * 3
     * 2
     */
    @Test
    public void hello() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Hello");
            }
        }
    }

    /**
     * Сколько раз выполнится следующий цикл? Цикл do while.
     *  Ответ: Цикл будет выполнятся 1 раз
     */
    @Test
    public void cicleDo() {
        int count = 1;
        do {
            count++;
        } while (count > 2);
        System.out.println(count);
    }

    /**
     * Чему будет равно следующее логическое выражение? Оператор &&.
     *  V true
     *    false
     *    Ошибка компиляции
     */
    @Test
    public void shotAnd() {
/*
        boolean result = 2 > 0 && 3 < 5 && !false;
        System.out.println(result);
*/
    }

    /**
     * Что делает следующий метод? Побитовый сдвиг.
     *      Побитовый сдвиг вправо, в результате которого число a заменяется на 1.
     *      Побитовый сдвиг вправо, в результате которого к числу a прибавляется 1.
     * V     Побитовый сдвиг вправо, в результате которого число делится на 2 с округлением в меньшую сторону.
     *      Побитовый сдвиг влево, в результате которого число умножается на 2.
     *      Результат = 2
     */
    @Test
    public void bit() {
        int a = 4;
        int b = a >> 1;
        System.out.println(b);

    }

    /**
     * Что произойдёт в следующем примере?
     * V?  Программа скомпилируется, но при запуске выдаст исключение NullPointerException.
     *   Программа не скомпилируется.
     *   Программа напечатает в консоли null.
     *
     */

    @Test
    public void valueNull() {
        Integer a = null;
        int b = a;
        System.out.println(b);
    }
}