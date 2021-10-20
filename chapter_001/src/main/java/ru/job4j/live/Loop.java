package ru.job4j.live;

/**
 * 5.9.1. Генерация конструкций в IDEA [#279134]
 * В этом уроке мы познакомимся с удобной функцией
 * IDEA - живыми шаблонами.
 * Живые шаблоны - это набор символов, введенных в поле редактирования,
 * которые преобразовываются в конструкции языка.
 */
public class Loop {

    /**
     * Часто используемые сокращения
     * psvm - public static void main(String[] args)
     * fori - for (int i = 0; i < 10; i++
     * sout - System.out.println();
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("1");
        }
    }
}