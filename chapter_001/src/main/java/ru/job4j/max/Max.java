package ru.job4j.max;

/*
Вычисляем максимум из 2-х чисел
Сalculate a maximum of two numbers
 */

public class Max {
   private int maximum;

   public int max(int first, int second) {
      maximum = first > second ? first : second;
      return maximum;
   }
}
