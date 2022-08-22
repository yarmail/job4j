package ru.job4j.enumclass;

/**
 * В перечислении мы перечисляем все объекты,
 * которые нам нужны
 *
 * Далее мы можем создавать
 * объекты этих классов (энамов)
 * (пробуем повторить ситуацию класса ABeforeEnum)
 *
 * 1. Удобно тем, что в переменную мы можем поместить
 * только заявленные перечисления
 * 2. Срзу понятно, какое именно перечисление мы
 * помещаем
 *
 */
public enum BEnum {
    DOG, CAT, FROG;

    public static void main(String[] args) {
        BEnum animal = BEnum.DOG;

        switch (animal) {
            case CAT -> System.out.println("это кошка");
            case DOG -> System.out.println("это собака");
            default -> {

            }
        }
   }
}