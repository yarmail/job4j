package ru.job4j.anonymclass;

/**
 * Анонимные классы
 *
 * модель данных - Attachment.java
 *
 * Отсортировать эту модель по полю size или name
 *
 *
 * Вариант 1
 * Создаем обычный класс AttachmentComp реализующий Comparator
 * public class AttachmentComp implements Comparator
 * в котором мы переопределяем метод интерфейса Comparator
 *
 * Вариант 2
 * Можно уменьшить количество классов и кода,
 * создав объект в любом месте класса на основе анонимного
 * класса и интерфейса
 * public class AttSortTest
 *
 * Анонимный класс на основании класса java.util.ArrayList.
 * ArrayList list = new ArrayList() {
 *     @Override
 *     public boolean add(Object o) {
 *         System.out.println("Add a new element to list: " + o);
 *         return super.add(o);
 *     }
 * };
 * list.add(100500);
 *
 * Обобщенные типы и анонимный класс
 * Пример 1
 * Comparator<Attachment> comparator =  new Comparator<Attachment>() {
 *     @Override
 *     public int compare(Attachment left, Attachment right) {
 *         return left.getSize() - right.getSize();
 *     }
 * };
 *
 * Пример 2
 * ArrayList<Integer> list = new ArrayList<Integer>() {
 *     @Override
 *     public boolean add(Integer o) {
 *         System.out.println("Add a new element to list: " + o);
 *         return super.add(o);
 *     }
 * };
 *
 *
 *
 *
 */

