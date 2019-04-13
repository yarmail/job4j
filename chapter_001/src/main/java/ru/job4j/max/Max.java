package ru.job4j.max;

public class Max {
   private int maximum;
   /**
    * Методы, возвращающие максимум их двух и трех чисел.
    * Methods returning a maximum of two and three numbers.
    *
    * maximum = first > second ? first : second; // для вычислений максимума из
    * 2-х чисел используем тернарный вариант оператора if
    * в теории результат сравнения первых двух чисел сравниваем с третьим числом
    * public int max...// используем перегрузку методов (с одинаковым названием)
    * используем вызов метода в методе вместо одной из переменных (матрешка)
    * @param first  первое значение
    * @param second второе значение
    * @return наибольшее значение.
    */

   public int max(int first, int second) {
      maximum = first > second ? first : second;
      return maximum;
   }
   public int max(int first, int second, int third) {
      return max(max(first, second), third);
   }
}