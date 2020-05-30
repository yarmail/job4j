package ru.job4j.classandobject;

/**
 * Object Creation
 * Создание объекта [#165452] 01.2020
 * Здесь мы создаем переменную типа Cat с именем peppy.
 * Далее мы записываем в эту переменную объект типа Cat.
 * Важный момент. Оператор new резервирует кусок памяти
 * и записывает в нее данные объекта класса Cat.
 *
 */
public class ObjectCreation {

    public class Cat {
        public void main(String[] args) {
            Cat peppy = new Cat();
            Cat sparky = new Cat();

        }
    }

}
