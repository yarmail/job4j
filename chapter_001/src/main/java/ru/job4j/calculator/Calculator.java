package ru.job4j.calculator;

/**
 * Elementary calculator: sum, subtract, multiple, div
 * элементарный калькулятор: сложение, вычетание, умножение и деление
 *
 */
public class Calculator {
    private static final int X = 5;
    private static String  ls = System.lineSeparator();

    public int sum(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiple(int first, int second) {
        return first * second;
    }

    public int div(int first, int second) {
        return first / second;
    }

    /**
     * 1.9. Статические и не статические методы [#504806]
     * Задание:
     * - статический метод minus(), который принимает
     *  число типа int и находит разницу между этим
     * числом и полем x:
     */
    public static int minus(int number) {
        return number - X;
    }

    /**
     *  - нестатический метод divide(),
     *  который принимает число типа int
     *  и находит результат разделения
     *  переданного числа, на поле x.
     */
    public int divide(int number) {
        return number / X;
    }

    /**
     * - нестатический метод sumAllOperation(),
     * который принимает число типа int и находит результат
     * суммирования всех операций: sum(), multiply(),
     * minus(), divide() и возвращает результат вычисления всех этих операций.
     */
    public int sumAllOperation(int number) {
        return sum(number, X) + multiple(number, X)
                + minus(number) + divide(number);
    }

    /**
     * В методе main продемонстрируйте как будете вызывать
     * все созданные методы. Обратите внимание,
     * что для вызова нестатических методов необходимо
     * создавать экземпляр класса.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("sum = " + calc.sum(5, X) + ls
                + "multiple = " + calc.multiple(5, X) + ls
                + "minus = " + minus(6) + ls
                + "divide = " + calc.divide(5) + ls
                + "sumAllOperation = " + calc.sumAllOperation(5));
    }
}