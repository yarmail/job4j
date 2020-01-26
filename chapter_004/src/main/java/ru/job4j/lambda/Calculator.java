package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Calculator {

    /**
     * Этот интерфейс описывает функцию,
     * принимающую два параметра left, right
     * и возвращающую значение типа double.
     */
    @FunctionalInterface
    public interface Operation {
        double calc(int left, int right);
    }

    /**
     * Вариант 1
     * Давайте представим, что мы хотим вывести на экран таблицу
     * умножения от 0 до 10 для числа 2.
     * Это метод умножения
     */
    public void multipleOne(int start, int finish, int value, Operation op) {
        for (int index = start; index != finish; index++) {
            System.out.println(op.calc(value, index));
        }
    }

    /**
     * Вариант 2
     * Давайте теперь перепишем наш пример за счет
     * использования встроенных функций.
     *
     * Здесь используется BiFunction -
     * это функция принимает два параметра и возвращает значение.
     *<Integer, Integer, Double> - первый, второй параметр, возвращаемый тип.
     *
     * Consumer<Double> media - принимает значение
     * и ничего не возвращает.
     *
     */
    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }

    /**
     * Вариант 1
     * Здесь в метод multiple качестве параметра
     * (Operation op)
     * передается анонимный класс - new Operation,
     * который по-своему реализует интерфейс Operation

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(0, 10, 2,
                new Operation() {
                    @Override
                    public double calc(int left, int right) {
                        return left * right;
                    }
                });
    }
    */

    /**
     * Вариант 2
     * Мы реализуем параметр (Operation op - интерфейс) так:
     * вместо создания анонимного класса типа Operation
     * мы используем тот факт, что компилятору известно,
     * какой именно интерфейс мы будем использовать и
     * используем лямбда выражения:
     * С левой стороны - (входящие параметры, через запятую,
     * без указания типа) -> (операторы, работающие с входящими
     * параметрами) для обязательной реализации метода
     *

        public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(0,10,2,
                (value, index) -> value * index
        );
    }
    */

    /**
     * Вариант 3
     * Поправим метод main.
     * result -> System.out.println(result)
     * - описывается интерфейсом Consumer<Double>
     * Если мы используем один входной параметр, скобки можно опускать.
     */
    public static void main3(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2,
                (value, index) -> {
                    double result = value * index;
                    System.out.printf("Multiple %s * %s = %s %n", value, index, result);
                    return result;
                },
                result -> System.out.println(result)
        );
    }

    /**
     * Вариант 4.
     * Использование ссылок на методы.
     * Для примера мы создали класс MathUtil
     * Статические методы этого класса мы можем заменить
     * на интерфейс
     *
     * BiFunction<Integer, Integer, Double> op,
     * два входящих параметра и один выходящий.
     *
     * Если такое соответствие применимо, то мы можем указать использовать этот метод за место ламбды
     * Такой вызов называется ссылка на метод.
     *
     * Синтаксис вызова (Имя класс)::(имя методы)
     * Важно, здесь не указываются параметры.
     *
     */
    public static void main4(String[] args) {
        Calculator calc = new Calculator();
        calc.multiple(
                0, 10, 2, MathUtil::add,
                result -> System.out.println(result)
        );
    }
}
