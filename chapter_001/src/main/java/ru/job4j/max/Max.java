package ru.job4j.max;

/**
 * 3. Перегрузить метод max для трех чисел [#122644]
 */
public class Max {
   /**
    * Методы, возвращающие максимум их двух и трех чисел.
    * Methods returning a maximum of two and three numbers.
    *
    * maximum = first > second ? first : second; -> для вычислений максимума из
    * 2-х чисел используем тернарный вариант оператора if
    * в теории результат сравнения первых двух чисел сравниваем с третьим числом
    * public int max...-> используем перегрузку методов (с одинаковым названием)
    * используем вызов метода в методе вместо одной из переменных (матрешка)
    * @param first  первое значение
    * @param second второе значение
    * @return наибольшее значение.
    *
    * Задание:
    * добавить перегруженный метод max для трех и четырех чисел
    * (тесты есть)
    */
   public int max(int first, int second) {
      return first > second ? first : second;
   }

   public int max(int first, int second, int third) {
      return max(max(first, second), third);
   }

   public int max(int first, int second, int third, int fourth) {
      return max(max(first, second), max(third, fourth));
   }
}