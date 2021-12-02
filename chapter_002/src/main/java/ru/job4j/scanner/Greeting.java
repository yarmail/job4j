package ru.job4j.scanner;

import java.util.Scanner;

/**
 * Пример работы класса Scanner
 * Он принимает в качестве параметра объект "System.in".
 * У объекта Scanner есть метод nextLine(), который считывает
 * все символы строки после нажатия на клавишу Enter.
 * Когда мы вызываем этот метод в коде,
 * программа останавливается и ждет,
 * пока пользователь введет символы в консоль
 * и нажмет на кнопку Enter.
 * После того, как пользователь нажал кнопку Enter,
 * программа записывает введенные символы
 * в переменную и продолжает выполнение программы.
 *
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать. Как вас зовут?");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть");
    }
}