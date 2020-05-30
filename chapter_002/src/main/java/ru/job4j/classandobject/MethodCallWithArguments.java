package ru.job4j.classandobject;


/**
 * Method call with arguments
 * 1.3. Вызов метода с аргументами. [#166086] 09.2019
 * Термин "входящие параметры" обозначает переменные,
 * которые будут доступны внутри метода и которые нужно
 * проинициализировать при вызове этого метода.
 */

/**
 * мы создаем переменную song и записываем в нее значение.
 */
/*
 String song = "I believe, I can fly";
 */

/**
 * У нас есть метод music().
 *
 */
/*
public void music() {
        System.out.println("Tra tra tra");
        }
*/

/**
 * Мы хотим дать возможность играть разную мелодию.
 * Для этого в круглых скобках указываем переменные,
 * с которыми хотим работать.
 */
/*
public void music(String lyrics) {
    System.out.println("I can sign a song : " + lyrics);
}
*/
/**
 * А дальше вызываем метод music у объекта petya
 * и передаем туда переменную song.
 * (конечный вариант)
 */
/*
public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
        }
*/