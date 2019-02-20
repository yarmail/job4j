package ru.job4j.max;

/*
Вычисляем максимум из 2-х чисел
Сalculate a maximum of two numbers
 */

public class Max {
   private int maximum;
   /**
    * Метод возвращающий максимум их двух чисел.
   *
   * @param first  первое значение
   * @param second второе значение
   * @return наибольшее значение.
   */


   public int max(int first, int second) {
      // для вычислений максимума из 2-х чисел используем тернарный вариант оператора if
      maximum = first > second ? first : second;
      return maximum;
   }

   // в теории результат сравнения первых двух чисел сравниваем с третьим числом
   // используем перегрузку методов (с одинаковым названием)
   public int max(int first, int second, int third) {
      // используем вызов метода в методе вместо одной из переменных (матрешка)
      return max(max(first, second), third);
   }
}
