package ru.job4j.inheritance;

/**
 * Inheritance - Theory and Example
 *
 * Теория
 * Наследование — это механизм в программировании,
 * в том числе и в Java, который позволяет описать
 * новый класс на основе уже существующего.
 * Класс-наследник при этом получает доступ к полям
 * и методам родительского класса.
 */

/**
 * Пример
 * Класс имеет один метод.
 * Теперь давайте сделаем класс ToyCat на о
 * сновании класса Cat.
 * Обратите внимание, в классе ToyCat появился метод
 * canBeWashByWashMachine  этот метод есть только
 * у игрушечной кошки. Теперь давайте создадим объекты.
 * Объект toy имеет два метода:
 * canPurr, который наследовался от Cat.
 * canBeWashByWashMachine, который объявлен
 * в самом классе ToyCat.
 * Это возможно за счет наследования. Класс ToyCat
 * унаследовал метод purr() от родителя - класса Cat.
 *
 */
/*
public class Cat {
    public boolean canPurr() {
        return true;
    }
}
*/
/*
public class ToyCat extends Cat {
    public boolean canBeWashByWashMachine() {
        return true;
    }
}
*/
/*
public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());

        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
        }
*/


