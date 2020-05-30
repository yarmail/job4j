package ru.job4j.classandobject;

/**
 * Object Status
 * Состояние объекта. [#167388] 03.2020
 * С помощью одного класса мы распишем
 * взаимодействие двух объектов.
 * Давайте сделаем класс Jar и создадим в нем поле
 * private int value; В поле будет содержаться количество воды.
 * Так же добавим конструктор для инициализации
 * начального состояния сосуда.
 */
/*
public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }
}
*/

/**
 * Теперь давайте добавим в него метод,
 * который будет принимать объект типа Jar.
 * Так же напишем метод main с демонстрацией работы.
 * Теперь давайте разберемся, что произошло в методе main.
 *
 * Вначале мы создаем два объекта first, second.
 * В каждом объекте хранятся свои данные.
 * В first value = 10. в second value = 5..
 * Дальше мы выводим на консоль значение value для к
 * аждого объекта. *
 * А дальше идет главная строка.
 *
 *         first.pour(second);
 *
 * Здесь мы у объекта first вызывает метод pour.
 * В нем есть поле this.value - this - указывает на то,
 * что нужно взять значение этой переменной у объекта
 * для которого мы вызываем метод, то есть если мы вызываем
 * метод pour у объекта first, то this.value будет 10.
 * Если мы вызовем у объекта second метод pour, то для него
 * будет значение this.value  равно 5.
 * Дальше в методе pour передается переменная another.
 * У нее мы тоже можем получить значение, но обращаться к полю
 * этого объекта мы должны через имя переменной another.value.
 * То есть в нашем методе есть два объекта и два значения value. первый это у кого мы вызываем метод pour
 * и второй этот тот объект, который мы передаем в метод pour.
 * Здесь мы видим все мощь использования ООП над
 * процедурным стилем.
 */
/*
public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}
 */
/*
Вывод:
first:10. second:5
first:15. second:0
 */