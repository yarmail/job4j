package ru.job4j.classandobject;

/**
 * Object Fields
 * Поля объекта [#166083] 03.2020
 */

/**
 * Здесь мы создали поле класса Cat, которое называется food.
 */

/*
public class Cat {

    private String food;

    public static void main(String[] args) {
        Cat peppy = new Cat();
    }
}
*/
/**
 * Давайте создадим метод void show(), который будет выводить
 * в консоль содержимое поля food.
 * Для того, чтобы обратиться к полю объекта,
 * нам нужно использовать ключевое слово this.
 * Это слово указывает, что нужно вывести содержимое поля.
 * this - дальше указываем имя поля, которое нужно вывести.
 */
/*
public class Cat {

    private String food;

    public void show() {
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
    }
}
*/

/**
 * Давайте в особом методе main создадим два объекта класса
 * Cat. Назовем их gav, black и у каждого объекта вызовем
 * метод show();
 * Как мы видим, в консоли появились null. По умолчанию,
 * во всех полях объекта записываются значения по умолчанию.
 * String - это ссылочный тип, его значение по умолчанию -
 * нулевая ссылка. Для примитивных типов int, long, short, byte,
 * double, float = 0, для boolean = false, для char пустой символ
 */
/*
public class Cat {

    private String food;

    public void show() {
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.show();
    }
}
 */
/**
 * Давайте теперь доработаем наш код и научимся записывать
 * в поле объекта данные.
 * Для этого создадим метод, который принимает параметры:
 * void eat(String meat).
 * Давайте поговорим про метод eat.
 * this.food = meat;
 * строчка записывает в поле объект food значение переменной
 * meat. Значение переменной meat присваивается в методе main:
 * Давайте запустим наш код.
 * Теперь мы видим, что котенок гав съел котлету,
 * а черный кот съел рыбу. Здесь важно отметить: класс,
 * описывающий кота, у нас один, но объектов мы создаем два.
 */
/*
public class Cat {

    private String food;

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();
    }
}
*/
