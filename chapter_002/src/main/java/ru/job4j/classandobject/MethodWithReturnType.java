package ru.job4j.classandobject;

/**
 * Call Method With Return Type
 * Вызов метода с возвращаемым типом. [#167387] 09.2019
 * Термин "вернуть значение" означает записать
 * в переменную результат вычисления метода.
 *
 * Чтобы метод мог вернуть значение надо
 * в объявление метода вместо слова void указать
 * тип данных, которые мы хотим вернуть.
 */


/**
 * Давайте вернемся к классу и добавим в него
 * метод public String sound()
 * Мы вместо void напишим тип данных String.
 * Поэтому в конце метода мы должны использовать
 * оператор return с указанием переменной типа String.
 * Внутри метода мы создаем переменную String voice
 * и ее указываем операторе return.
 */
/*
    public String sound() {
        String voice = "may-may";
        return voice;
    }
*/
/**
 * Теперь вызов метод peppy.sound() можно представить
 * как переменную типа String. Ниже в методе main.
 */
/*
    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say)
*/